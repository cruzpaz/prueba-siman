package com.marvel.marvelsiman.service;

import com.marvel.marvelsiman.dtoComics.Comics;
import com.marvel.marvelsiman.dtoComics.RestResponseComics;
import com.marvel.marvelsiman.util.MarvelUrlGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ComicsService {
    private final RestTemplate restTemplate;


    @Autowired
    MarvelUrlGenerator marvelUrlGenerator;

    public ComicsService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<Comics> findComicsAll() {
        List<Comics> comicsList = new ArrayList<>();
        RestResponseComics apiResponse = restTemplate.getForObject(getComicsUrl() , RestResponseComics.class);

        if (apiResponse != null && apiResponse.getCode().equals("200")) {
            comicsList = Arrays.asList(apiResponse.getData().getResults());
        }

        return comicsList;
    }

    public Comics findComicsById(int id) {
        Comics comics = new Comics();

        RestResponseComics apiResponse = restTemplate.getForObject(getComicsUrl() + "&id=" + id, RestResponseComics.class);

        if (apiResponse != null && apiResponse.getCode().equals("200")) {
            comics = apiResponse.getData().getResults()[0];
        }

        return comics;
    }


    private String getComicsUrl() {
        long ts = System.currentTimeMillis();
        return marvelUrlGenerator.generateComicsUrl(ts);
    }
}
