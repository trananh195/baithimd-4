package com.example.baithimd4.service;

import java.util.Optional;

public interface GenerateService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    public void save(T t);

    void delete(Long id);
}
