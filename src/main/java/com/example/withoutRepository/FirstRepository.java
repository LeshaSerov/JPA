package com.example.withoutRepository;

import org.springframework.data.repository.ListCrudRepository;

public interface FirstRepository extends ListCrudRepository<First,Long> {
    
}
