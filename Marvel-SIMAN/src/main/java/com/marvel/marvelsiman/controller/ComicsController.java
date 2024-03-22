package com.marvel.marvelsiman.controller;


import com.marvel.marvelsiman.dtoComics.Comics;
import com.marvel.marvelsiman.service.ComicsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ComicsController {
    private ComicsService comicsService;

    public ComicsController(ComicsService comicsService) {
        this.comicsService = comicsService;
    }

    //MOSTRAR LISTA DE COMICS COMPLETAS-----4
    @GetMapping("/comicsAll")
    public List<Comics> findComicsAll() {
        return comicsService.findComicsAll();
    }
    //MOSTRAR COMIC FILTRADO POR ID
    @GetMapping("/comics/{id}")
    public Comics findComicsById(@PathVariable int id) {
        return comicsService.findComicsById(id);
    }



}
