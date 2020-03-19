package com.example.tutorialspoint;

public class SpellChecker {

    private String pencil;

    private int score;

//    public SpellChecker() {
//        System.out.println("Inside Spelling contructor");
//    }


    public SpellChecker(String pencil, int score) {
        this.pencil = pencil;
        this.score = score;
        System.out.println("Inside Spelling contructor123");
    }

    public String getPencil() {
        return pencil;
    }

    public void setPencil(String pencil) {
        this.pencil = pencil;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void checkSpelling(){
        System.out.println("checkSpelling method");
    }
}
