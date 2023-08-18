package com.rimfire.entities;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import jakarta.validation.constraints.NotNull;

// import java.util.UUID;



@MappedEntity
public record Users (
    @Id @NotNull Long id,
    @NotNull String username,
    @NotNull String password
) {

}