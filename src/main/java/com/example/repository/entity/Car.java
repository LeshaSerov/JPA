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
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long carId;
    @NonNull
    private String name;

//    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    private ClassCar classCar;

//    @OneToOne(optional = false)
//    private Number number;

//    @ManyToMany
//    private Set<Owner> owners;
}
