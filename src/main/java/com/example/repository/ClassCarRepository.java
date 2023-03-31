package com.example.repository;

import com.example.repository.entity.ClassCar;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassCarRepository extends ListCrudRepository<ClassCar, Long> {
}
