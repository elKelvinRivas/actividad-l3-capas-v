package com.example.videojuegos_labo3.Services.Implementations;

import com.example.videojuegos_labo3.DTO.VideogameDTO;
import com.example.videojuegos_labo3.DTO.VideogameResponse;
import com.example.videojuegos_labo3.Services.VideogameService;
import com.example.videojuegos_labo3.entities.Videogame;
import com.example.videojuegos_labo3.repository.VideogameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideogameImpl implements VideogameService {

    private final VideogameRepository videogameRepository;

    public VideogameImpl(VideogameRepository videogameRepository) {
        this.videogameRepository = videogameRepository;
    }

    @Override
    public VideogameResponse findById(Integer id) {
        return videogameRepository.findById(id)
                .map(videogame -> new VideogameResponse(videogame.getId(), videogame.getName(), videogame.getGenre(), videogame.getReleaseYear(), videogame.getDeveloper()))
                .orElse(null);
    }

    @Override
    public VideogameDTO save(VideogameDTO videogameDTO) {
        Videogame videogame = new Videogame();
        videogame.setName(videogameDTO.getName());
        videogame.setGenre(videogameDTO.getGenre());
        videogame.setReleaseYear(videogameDTO.getReleaseYear());
        videogame.setDeveloper(videogameDTO.getDeveloper());

        Videogame saved = videogameRepository.save(videogame);
        return new VideogameDTO(saved.getName(), saved.getGenre(), saved.getReleaseYear(), saved.getDeveloper());}

    @Override
    public List<VideogameResponse> findAll() {
        return videogameRepository.findAll().stream()
                .map(videogame -> new VideogameResponse(
                        videogame.getId(),
                        videogame.getName(),
                        videogame.getGenre(),
                        videogame.getReleaseYear(),
                        videogame.getDeveloper()
                )).toList();
    }
}
