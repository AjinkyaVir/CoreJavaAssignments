package com.company.methodoverloading.methodoverloadingchallengeone;

public class Main {
    public static void main(String[] args) {
    
        int newScore = calculateScore("Ajinkya", 500);
        System.out.println("New score is : " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName,int score) {
        System.out.println("Player " + playerName + " Score " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player score " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Player without name, without score");
        return 0;
    }

}
