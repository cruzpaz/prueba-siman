package com.marvel.marvelsiman.service;

import com.marvel.marvelsiman.domain.Hero;
import com.marvel.marvelsiman.dto.HeroComicsDTO;
import com.marvel.marvelsiman.dto.HeroDTO;
import com.marvel.marvelsiman.dto.RestResponse;
import com.marvel.marvelsiman.dto.RestResponseComics;
import com.marvel.marvelsiman.dtoComics.Comics;
import com.marvel.marvelsiman.repository.HeroRepository;
import com.marvel.marvelsiman.util.MarvelUrlGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HeroService {
    private final RestTemplate restTemplate;



    @Autowired
    MarvelUrlGenerator marvelUrlGenerator;

    public HeroService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }


    public List<HeroDTO> findHeroesByName(String name) {
        List<HeroDTO> heroDTOList = new ArrayList<>();
        RestResponse apiResponse = restTemplate.getForObject(getHeroUrl() + "&nameStartsWith=" + name, RestResponse.class);

        if (apiResponse != null && apiResponse.getCode().equals("200")) {
            heroDTOList = Arrays.asList(apiResponse.getData().getResults());
        }

        return heroDTOList;
    }
    public List<HeroDTO> findHeroesComics(String name){
        List<HeroDTO> heroDTOList = new ArrayList<>();
        RestResponse apiResponse = restTemplate.getForObject(getHeroUrl() + "&comics=" + name, RestResponse.class);

        if (apiResponse != null && apiResponse.getCode().equals("200")) {
            heroDTOList = Arrays.asList(apiResponse.getData().getResults());
        }

        return heroDTOList;
    }
    public List<HeroDTO> findHeroesSerie(String name){
        List<HeroDTO> heroDTOList = new ArrayList<>();
        RestResponse apiResponse = restTemplate.getForObject(getHeroUrl() + "&series=" + name, RestResponse.class);

        if (apiResponse != null && apiResponse.getCode().equals("200")) {
            heroDTOList = Arrays.asList(apiResponse.getData().getResults());
        }

        return heroDTOList;
    }
    public List<HeroComicsDTO> HeroesComicsByName(String name) {
        List<HeroComicsDTO> heroDTOList = new ArrayList<>();
        RestResponseComics apiResponse = restTemplate.getForObject(getHeroUrl() + "&nameStartsWith=" + name, RestResponseComics.class);

        if (apiResponse != null && apiResponse.getCode().equals("200")) {
            heroDTOList = Arrays.asList(apiResponse.getData().getResults());
        }

        return heroDTOList;
    }
    public HeroDTO findHeroById(int id) {
        HeroDTO heroDTO = new HeroDTO();

        RestResponse apiResponse = restTemplate.getForObject(getHeroUrl() + "&id=" + id,RestResponse.class);

        if (apiResponse != null && apiResponse.getCode().equals("200")) {
            heroDTO = apiResponse.getData().getResults()[0];
        }

        return heroDTO;
    }


    private String getHeroUrl() {
        long ts = System.currentTimeMillis();
        return marvelUrlGenerator.generateHeroUrl(ts);
    }
}
