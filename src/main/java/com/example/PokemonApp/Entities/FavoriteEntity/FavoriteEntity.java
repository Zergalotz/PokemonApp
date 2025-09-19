package com.example.PokemonApp.Entities.FavoriteEntity;

import com.example.PokemonApp.Entities.BaseEntity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class FavoriteEntity extends BaseEntity {
    private Long userId;
    private Long pokemonId;

    public FavoriteEntity() {}

    public FavoriteEntity(Long userId, Long pokemonId) {
        this.userId = userId;
        this.pokemonId = pokemonId;
    }
}
