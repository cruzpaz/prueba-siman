package com.marvel.marvelsiman.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataComics {
    private int total;
    private HeroComicsDTO[] results;


    @Override
    public String toString() {
        return "Data{" +
                "total=" + total +
                '}';
    }
}