package com.example.PokemonApp.Entities.UserEntity;

import com.example.PokemonApp.Entities.BaseEntity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
@Entity
public class UserEntity extends BaseEntity {
    private String username;
    private String password;

    public UserEntity() {}
}
