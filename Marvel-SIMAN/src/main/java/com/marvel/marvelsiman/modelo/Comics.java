package com.marvel.marvelsiman.modelo;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="comics")
public class Comics {
    @Id
    private String id;
    private String title;

    @ManyToOne
    @JoinColumn(name = "id_personaje")
    private Personaje personaje;


}
