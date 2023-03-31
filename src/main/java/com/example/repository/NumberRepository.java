package com.example.repository;

import com.example.repository.entity.Number;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository extends ListCrudRepository<Number, Long> {
}
