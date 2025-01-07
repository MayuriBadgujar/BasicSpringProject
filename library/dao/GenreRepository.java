package com.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre,Integer> {

}
