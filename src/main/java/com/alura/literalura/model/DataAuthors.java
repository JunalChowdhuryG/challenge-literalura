package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataAuthors(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") int anioNacimiento,
        @JsonAlias("death_year") int anioMuerte
) {
}