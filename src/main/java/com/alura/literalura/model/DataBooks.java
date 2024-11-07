package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBooks(
        @JsonAlias("title") String titulo,
        @JsonAlias("download_count") int decargas,
        @JsonAlias("authors") List<DataAuthors> autores,
        @JsonAlias("languages") List<String> idiomas
) {
}
