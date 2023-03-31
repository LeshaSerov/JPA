package com.example.repository.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private ClassCar classCar;


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "cars_owners",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "owner_id")
    )
    private Set<Owner> owners;

    public void addOwner(Owner owner){
        this.owners.add(owner);
        owner.getCars().add(this);
    }
    public void removeOwner(Owner owner){
        this.owners.remove(owner);
        owner.getCars().remove(this);
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (!(o instanceof Car)) return false;
//        return id != null && id.equals(((Car) o).getId());
//    }

    @OneToOne(
            mappedBy = "car",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private Number number;
    public void setNumber(Number number) {
        if (number == null) {
            if (this.number != null) {
                this.number.setCar(null);
            }
        }
        else {
            number.setCar(this);
        }
        this.number = number;
    }
}
