package com.example.videojuegos_labo3.Services.Implementations;

import com.example.videojuegos_labo3.DTO.VideogameDTO;
import com.example.videojuegos_labo3.Services.VideogameService;
import com.example.videojuegos_labo3.entities.Videogame;
import com.example.videojuegos_labo3.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideogameImpl implements VideogameService {

    private final VideogameRepository videogameRepository;

    @Autowired
    public VideogameImpl(VideogameRepository videogameRepository) {
        this.videogameRepository = videogameRepository;
    }

    @Override
    public VideogameDTO save(VideogameDTO videogameDTO) {
        Videogame videogame = new Videogame();
        videogame.setName(videogameDTO.getName());
        videogame.setGenre(videogameDTO.getGenre());
        videogame.setReleaseYear(videogameDTO.getReleaseYear());
        videogame.setDeveloper(videogameDTO.getDeveloper());

        Videogame saved = videogameRepository.save(videogame);
        return new VideogameDTO(saved.getId(),saved.getName(),saved.getGenre(), saved.getReleaseYear(), saved.getDeveloper());
    }


}
