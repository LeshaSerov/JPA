package com.example.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
public class Owner {
    @Id
    private Long ownerId;

//    @ManyToMany
//    private Set<Car> cars;

}
