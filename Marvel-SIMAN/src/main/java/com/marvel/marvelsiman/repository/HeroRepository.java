package com.marvel.marvelsiman.repository;


import com.marvel.marvelsiman.domain.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
public interface HeroRepository extends JpaRepository<Hero, String> {
}
