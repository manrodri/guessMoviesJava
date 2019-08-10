package com.company;

import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class GameManagerTest {

    @Test
    public void createGameManagerTest(){
        File file = new File("movies.txt");
        GameManager gameManager = new GameManager(file);
    }

    @Test
    public void getRandomFilm() {
        File file = new File("movies.txt");
        GameManager gameManager = new GameManager(file);
        try{
            Film film = gameManager.getRandomFilm();
            assertTrue(film instanceof Film);
        } catch (FileNotFoundException err){
            System.out.println("File not found");
        }
    }

    @Test
    public void startGame() {
    }

    @Test
    public void displayNumberOfAttemptsLeft() {
    }

    @Test
    public void endGame() {
    }

    @Test
    public void getRandomNumber() {
        File file = new File("movies.txt");
        GameManager gameManager = new GameManager(file);
        int number = gameManager.getRandomNumber();
        assertTrue(number > 0 && number < 26);

    }
}