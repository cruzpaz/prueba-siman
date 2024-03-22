package com.marvel.marvelsiman.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MarvelUrlGenerator {
    @Value("${marvel.api.baseUrl}")
    public String marvelApiUrl;

    @Value("${marvel.api.publickey}")
    public String publicKey;

    @Autowired
    private HashGenerator hashGenerator = new HashGenerator();

    public String generateHeroUrl(long ts) {
        return marvelApiUrl + "characters?ts=" + ts + "&apikey=" + publicKey + "&hash=" + hashGenerator.generate(ts);
    }
    public String generateComicsUrl(long ts) {
        return marvelApiUrl + "comics?ts=" + ts + "&apikey=" + publicKey + "&hash=" + hashGenerator.generate(ts);
    }
}
