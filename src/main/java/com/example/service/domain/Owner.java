package com.example.service.domain;

import lombok.*;
import java.util.Set;

@Setter
@Getter
@RequiredArgsConstructor
public class Owner {
    @NonNull
    String name;
    private Set<Car> cars;
}
