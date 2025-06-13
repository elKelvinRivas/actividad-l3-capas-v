package com.example.videojuegos_labo3.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VideogameResponse {
    private Integer id;
    private String name;
    private String genre;
    private Integer realeaseYear;
    private String developer;
}
