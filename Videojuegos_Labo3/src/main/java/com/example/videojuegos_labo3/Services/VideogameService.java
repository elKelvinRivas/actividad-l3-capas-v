package com.example.videojuegos_labo3.Services;

import com.example.videojuegos_labo3.DTO.VideogameDTO;

import com.example.videojuegos_labo3.DTO.VideogameDTO;
import com.example.videojuegos_labo3.DTO.VideogameResponse;
import com.example.videojuegos_labo3.repository.VideogameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VideogameService{
    List<VideogameResponse> findAll();
    VideogameResponse findById(Integer id);
    VideogameDTO save(VideogameDTO videogameDTO);
}
