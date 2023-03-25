package com.example.repository;

import com.example.repository.entity.ClassCar;
import org.springframework.data.repository.ListCrudRepository;

public interface ClassCarRepository extends ListCrudRepository<ClassCar, Long> {
}
