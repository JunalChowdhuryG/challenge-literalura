package com.alura.literalura.repository;

import com.alura.literalura.model.Books;
import com.alura.literalura.model.Languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {
    @Query("SELECT b FROM Books b JOIN b.idiomas i WHERE i =:language")
    List<Books> searchBookByLanguage(Languages language);
    Optional<Books> findByTitulo(String titulo);
}
