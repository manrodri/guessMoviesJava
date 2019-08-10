package com.company;

public class Game {
    private boolean isOver=false;
    private int attamptsLeft;
    private Film film;

    public Game(int attamptsLeft, Film film) {
        this.film = film;
        this.attamptsLeft = attamptsLeft;
    }

    public int getAttamptsLeft() {
        return attamptsLeft;
    }

    public boolean isOver() {
        return this.isOver;
    }

    public void setIsOver(boolean isOver) {
        this.isOver = isOver;
    }

    public void setAttamptsLeft(int attamptsLeft) {
        this.attamptsLeft = attamptsLeft;
    }


}
