package com.example.service.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class Number {
    private String value;
    private Car car;

    public Number(String value) {
        this.value = value;
    }
}
