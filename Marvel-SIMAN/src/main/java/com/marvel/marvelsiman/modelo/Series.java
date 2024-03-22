package com.marvel.marvelsiman.modelo;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="series")
public class Series {
    @Id
    private String id;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_personaje")
    private Personaje personaje;
}
