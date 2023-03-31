package com.example.repository.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class ClassCar {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NonNull
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classCar", orphanRemoval = true, cascade =  CascadeType.ALL)
    private Set<Car> cars;

    public void addCar(Car car){
        this.cars.add(car);
        car.setClassCar(this);
    }
    public void removeCar(Car car){
        this.cars.remove(car);
        car.setClassCar(null);
    }
}
