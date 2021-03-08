package com.project.animes.util;

import com.project.animes.model.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name("One-Punch Man")
                .build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
                .name("One-Punch Man")
                .id(1L)
                .build();
    }

    public static Anime createValidUpdateAnime() {
        return Anime.builder()
                .name("Tokyo Ghoul")
                .id(1L)
                .build();
    }
}
