package com.marvel.marvelsiman.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Hero {
    @Id
    private String id;
    private String name;
    private String description;
    private String image;

}