package com.marvel.marvelsiman.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="personaje")
public class Personaje {
    @Id
    private String id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "personaje", cascade = CascadeType.ALL)
    List<Comics> comicsList;

    @OneToMany(mappedBy = "personaje", cascade = CascadeType.ALL)
    List<Series> seriesList;

    //comics Series

}
