package com.example.videojuegos_labo3.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
public class VideogameDTO {
    @NotNull(message = "El nombre no puede ser nulo")
    private String name;
    @NotNull(message = "El genero no puede ser nulo")
    private String genre;
    @NotNull(message = "El año no puede ser nulo")
    private Integer releaseYear;
    @NotNull(message = "El desarrollador no puede ser nulo")
    private String developer;
}
