package com.company.methodsexaampleone;

public class Test {

    public static void main(String[] args) {

        calaculateFinalScore(true, 800, 5, 100);
        calaculateFinalScore(false, 10000, 8, 200);

    }

    private static int calaculateFinalScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println(finalScore);
            return finalScore;
        }else
            return -1;
    }

}
