package com.example.PokemonApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntity extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
