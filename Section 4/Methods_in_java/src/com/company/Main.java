package com.company;

public class Main
{
    public static void main(String[] args) {
        int highScorePosition;

        highScorePosition = calculateScore(true, 800, 5, 200);
        System.out.println("Your final score was " + highScorePosition);

        highScorePosition = (calculateHighScorePosition(1500));
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = (calculateHighScorePosition(900));
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = (calculateHighScorePosition(400));
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = (calculateHighScorePosition(50));
        displayHighScorePosition("Gilli", highScorePosition);

        highScorePosition = (calculateHighScorePosition(1000));
        displayHighScorePosition("Leo", highScorePosition);

        highScorePosition = (calculateHighScorePosition(500));
        displayHighScorePosition("Annabeth", highScorePosition);

        highScorePosition = (calculateHighScorePosition(100));
        displayHighScorePosition("Jason", highScorePosition);
    }


    public static void displayHighScorePosition(String playername, int highScorePosition){
        System.out.println(playername + " managed to get into position " + highScorePosition + " on the High Score table");

    }

    public static int calculateHighScorePosition (int playerScore){
//        if(playerScore >=  1000){
//            return 1;
//        } else if(playerScore>=500){
//            return 2;
//        } else if(playerScore>=100){
//            return 3;
//        }
//        return 4;
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final Score was " + finalScore);
            System.out.println(levelCompleted);
            return finalScore;
        } else {
            return -1;
        }
    }
}
