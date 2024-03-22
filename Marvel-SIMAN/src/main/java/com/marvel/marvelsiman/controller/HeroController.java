package com.marvel.marvelsiman.controller;

import com.marvel.marvelsiman.domain.Hero;
import com.marvel.marvelsiman.dto.HeroComicsDTO;
import com.marvel.marvelsiman.dto.HeroDTO;
import com.marvel.marvelsiman.dtoComics.Comics;
import com.marvel.marvelsiman.service.HeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HeroController {
    private HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

   /* @GetMapping("/hero/{id}")
    public HeroComicsDTO findHeroById(@PathVariable int id) {
        return heroService.findHeroById(id);
    }*/

    //BUSCAR PERSONAJE DE MARVEL POR NOMBRE-----1
    @GetMapping("/hero")
    public List<HeroDTO> findHeroesByName(@RequestParam String name) {
        return heroService.findHeroesByName(name);
    }
    //BUSCAR PERSONAJE DE MARVEL POR COMICS-----1
    @GetMapping("/HeroComics")
    public List<HeroDTO> findHeroesComics(@RequestParam String comics) {
        return heroService.findHeroesComics(comics);
    }
    //BUSCAR PERSONAJE DE MARVEL POR SERIE-----1
    @GetMapping("/HeroSeries")
    public List<HeroDTO> findHeroesSerie(@RequestParam String serie) {
        return heroService.findHeroesSerie(serie);
    }

    //OBTENER EL LISTADO DE COMIC QUE TIENE UN PERSONAJE EN ESPECIFICO-----2
    @GetMapping("/heroComics")
    public List<HeroComicsDTO> HeroesComicByName(@RequestParam String name) {
        return heroService.HeroesComicsByName(name);
    }
    //MOSTRAR LA IMAGENY DESCRIPCION
    @GetMapping("/heroComics/{id}")
    public HeroDTO findHeroById(@PathVariable int id) {
        return heroService.findHeroById(id);
    }


}
