package com.example.service.domain;

import lombok.*;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
public class ClassCar {
    private String name;
    private Set<Car> cars;
}
