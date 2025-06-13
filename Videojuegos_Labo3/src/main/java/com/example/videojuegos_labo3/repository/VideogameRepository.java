package com.example.videojuegos_labo3.repository;

import com.example.videojuegos_labo3.entities.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Integer> {
}
