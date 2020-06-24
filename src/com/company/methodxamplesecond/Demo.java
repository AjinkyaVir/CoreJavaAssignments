package com.company.methodxamplesecond;

public class Demo {

    public static void main(String[] args) {

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50


        int highestScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ajinkya", highestScorePosition);

        highestScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Sayali", highestScorePosition);

        highestScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Shraddha", highestScorePosition);

        highestScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Abhinay", highestScorePosition);

        highestScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Anuja", highestScorePosition);

        highestScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Aniket", highestScorePosition);

    }

    private static int calculateHighScorePosition(int playerScore) {
      /*  if (playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500){
            return 2;
        }else  if (playerScore >= 100){
            return 3;
        }
        return 4;*/
      int position = 4;
        if (playerScore >= 1000){
            position =  1;
        }else if (playerScore >= 500){
            position =  2;
        }else  if (playerScore >= 100){
            position = 3;
        }
        return position;
    }

    private static void displayHighScorePosition(String playerName, int highestScorePosition) {

        System.out.println(playerName + " managed to get into position " +
                highestScorePosition + " on the high score table");

    }

}
