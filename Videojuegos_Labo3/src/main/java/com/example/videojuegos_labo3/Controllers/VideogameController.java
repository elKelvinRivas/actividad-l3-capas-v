package com.example.videojuegos_labo3.Controllers;

import com.example.videojuegos_labo3.DTO.VideogameDTO;
import com.example.videojuegos_labo3.DTO.VideogameResponse;
import com.example.videojuegos_labo3.Services.VideogameService;
import com.example.videojuegos_labo3.entities.Videogame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videogames")
public class VideogameController {

    @Autowired
    private VideogameService videogameService;

    @PostMapping()
    public ResponseEntity<VideogameDTO> saveVideogame(@RequestBody VideogameDTO videogameDTO) {
        return ResponseEntity.ok(videogameService.save(videogameDTO));

    }

    @GetMapping()
    public List<VideogameResponse> findAll() {
        return videogameService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VideogameResponse> getCarById(@PathVariable Integer id){
        return videogameService.findById(id) == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(videogameService.findById(id));
    }
}
