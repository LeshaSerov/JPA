package com.example.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassCar {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long classCarId;
    private String name;

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "classCar")
//    private Set<Car> cars;
}
