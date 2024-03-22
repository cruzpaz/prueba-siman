package com.marvel.marvelsiman.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.marvel.marvelsiman.modelo.Series;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    private int total;
    private HeroDTO[] results;


    @Override
    public String toString() {
        return "Data{" +
                "total=" + total +
                '}';
    }
}