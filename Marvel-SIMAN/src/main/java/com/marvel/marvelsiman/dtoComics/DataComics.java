package com.marvel.marvelsiman.dtoComics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.marvel.marvelsiman.dto.HeroComicsDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataComics {
    private int total;
    private Comics[] results;


    @Override
    public String toString() {
        return "Data{" +
                "total=" + total +
                '}';
    }
}