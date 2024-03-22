package com.marvel.marvelsiman.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestResponse {
    private String code;
    private String status;
    private Data data;



    @Override
    public String toString() {
        return "RestResponse{" +
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
