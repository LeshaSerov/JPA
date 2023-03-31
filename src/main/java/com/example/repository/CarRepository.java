package com.example.repository;

import com.example.repository.entity.Car;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface CarRepository extends ListCrudRepository<Car, Long> {
    @Transactional
    @Modifying
    @Query("update Car c set c.name = ?1 where c.id = ?2")
    int updateNameById(String name, Long id);
    @Override
    Optional<Car> findById(Long id);

    @Override
    void deleteById(Long id);
}
