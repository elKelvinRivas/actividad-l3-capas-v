package com.example.videojuegos_labo3.Services;

import com.example.videojuegos_labo3.DTO.VideogameDTO;

import com.example.videojuegos_labo3.DTO.VideogameDTO;
import com.example.videojuegos_labo3.repository.VideogameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VideogameService{
    List<VideogameDTO> findAll();
    VideogameDTO findById(Integer id);
    VideogameDTO save(VideogameDTO videogameDTO);
}
