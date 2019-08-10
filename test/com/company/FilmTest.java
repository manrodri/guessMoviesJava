package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilmTest {

    @Test
    public void convertTitleToUnderScores() {
        String title = "Star Wars";
        Film film = new Film(title);

        assertEquals("____ ____",film.convertTitleToUnderScores());
        assertEquals(title.length(), film.convertTitleToUnderScores().length());
    }


    @Test
    public void isCharInTitle() {
        char character = 'a';
        String title = "Star Wars";
        Film film = new Film(title);

        assertTrue(film.isCharInTitle(character));

        character = 'f';
        assertFalse(film.isCharInTitle(character));
    }

    @Test
    public void updateUnderScoreTitleFirtLetter() {
        char character = 'a';
        String title = "Star Wars";
        Film film = new Film(title);
        String underScoreTitle = film.convertTitleToUnderScores();

        assertEquals("__a_ _a__", film.substituteCharinUnderScoreTitle(character, underScoreTitle));
    }

    @Test
    public void updateUnderScoreTitleSecondLetter() {
        char character = 'a';
        String title = "star wars";
        Film film = new Film(title);
        String underScoreTitle = "s___ ____";

        assertEquals("s_a_ _a__", film.substituteCharinUnderScoreTitle(character, underScoreTitle));
    }

}