package com.example.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Number {
    @Id
    private Long numberId;
    private String name;

//    @OneToOne(optional = false)
//    private Car car;
}
