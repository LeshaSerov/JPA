package com.example.repository;

import com.example.repository.entity.Owner;
import org.springframework.data.repository.ListCrudRepository;

public interface OwnerRepository extends ListCrudRepository<Owner, Long> {
}
