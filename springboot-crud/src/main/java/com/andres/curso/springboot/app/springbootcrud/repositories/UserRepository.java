package com.andres.curso.springboot.app.springbootcrud.repositories;

import com.andres.curso.springboot.app.springbootcrud.entities.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepository extends ListCrudRepository<User, Long> {
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}
