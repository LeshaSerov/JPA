package com.example.repository;

import com.example.repository.entity.Car;
import org.springframework.data.repository.ListCrudRepository;

public interface CarRepository extends ListCrudRepository<Car, Long> {
}
