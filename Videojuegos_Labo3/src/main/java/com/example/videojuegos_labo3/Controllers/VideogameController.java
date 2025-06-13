package com.example.videojuegos_labo3.Controllers;

import com.example.videojuegos_labo3.DTO.VideogameDTO;
import com.example.videojuegos_labo3.Services.VideogameService;
import com.example.videojuegos_labo3.entities.Videogame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videogames")
public class VideogameController {

    @Autowired
    private VideogameService videogameService;

    @PostMapping()
    public ResponseEntity<VideogameDTO> saveVideogame(@RequestBody VideogameDTO videogameDTO) {
        return ResponseEntity.ok(videogameService.save(videogameDTO));

    }

}
