package com.example.service.domain;

import lombok.*;
import java.util.Set;

@Setter
@Getter
@RequiredArgsConstructor
public class Car {
    @NonNull
    private String name;
    private ClassCar classCar;
    @NonNull
    private Number number;
    private Set<Owner> owners;

    public Car(String name) {
        this.name = name;
    }
}
