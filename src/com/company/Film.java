package com.company;

public class Film {
    private String title;

    public Film(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String convertTitleToUnderScores(){
        String underScoresTitle="";
        for(int i=0; i < this.title.length() ; i++){
            if(this.title.charAt(i) == ' '){
                underScoresTitle += " ";
            } else{
                underScoresTitle += "_";
            }
        }
        return underScoresTitle;
    }

    public boolean isCharInTitle(char character){
        for(int i=0; i < this.title.length(); i++){
            if(this.title.charAt(i) == character){
                return true;
            }
        }
        return false;
    }

    public String substituteCharinUnderScoreTitle(char character, String displayedTitle){
        String newDisplayString="";
        for(int i=0; i<this.title.length(); i++){
            if(this.title.charAt(i) == character){
                newDisplayString += character;
            } else{
                newDisplayString += displayedTitle.charAt(i);
            }
        }
        return newDisplayString;
    }
}
