package com.marvel.marvelsiman.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestResponseComics {
    private String code;
    private String status;
    private DataComics data;



    @Override
    public String toString() {
        return "RestResponse{" +
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
