package com.gera.coding.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gera.coding.jpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
