package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameManager {
    private File file;

    public GameManager(File file) {
        this.file = file;

    }

    public int getRandomNumber(){
        int numberOfLines = 0;
        try{
            Scanner sc = new Scanner(this.file);
            while (sc.hasNextLine()){
                numberOfLines ++;
            }
        } catch (FileNotFoundException err){
            System.out.println("File not found");
            return  -1;
        }

        int randomNumber = (int)(Math.random()* numberOfLines) +1;
        return randomNumber;
    }

    public Film getRandomFilm() throws FileNotFoundException{
        Scanner sc = new Scanner(this.file);
        String filmTitle="";

        int numberOfLines = 0;

        int randomNumber = (int)(Math.random()* numberOfLines) +1;
        for(int i=0; i<numberOfLines; i++){
            filmTitle = sc.nextLine();
            if(randomNumber == i){
                break;
            }
        }
        Film film = new Film(filmTitle);
        return film;
    }

    public Game startGame(){
        try{
            Film film = getRandomFilm();
            Game game = new Game(10, film);
            return  game;
        } catch (FileNotFoundException err){
            System.out.println("Film file not found");
            return null;
        }
    }


    public void displayNumberOfAttemptsLeft(Game game){
        System.out.println(game.getAttamptsLeft());
    }

    public Game endGame(Game game){
        if (game.getAttamptsLeft() == 0){
            game.setIsOver(true);
            return game;
        } else {
            return game;
        }
    }

}
