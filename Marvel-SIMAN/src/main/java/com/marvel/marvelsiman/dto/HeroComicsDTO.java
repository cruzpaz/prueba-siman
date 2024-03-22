package com.marvel.marvelsiman.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeroComicsDTO {
    private DataSerie comics;

    public DataSerie getComics() {
        return comics;
    }

    public void setComics(DataSerie comics) {
        this.comics = comics;
    }

    @Override
    public String toString() {
        return "HeroDTO{" +

                '}';
    }
}
