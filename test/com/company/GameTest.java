package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void isOver() {
        Film film = new Film("Star Wars");
        Game game = new Game(10, film);
        assertFalse(game.isOver());
    }

    @Test
    public void numberOfAttempts() {
        Film film = new Film("Star Wars");
        Game game = new Game(10, film);
        assertEquals(10, game.getAttamptsLeft());

        game.setAttamptsLeft(9);
        assertEquals(9, game.getAttamptsLeft());
    }



}