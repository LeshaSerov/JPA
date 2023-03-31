package com.example.repository;

import com.example.repository.entity.Owner;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends ListCrudRepository<Owner, Long> {
}
