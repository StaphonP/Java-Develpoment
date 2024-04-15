package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Game Score");
        String gameScore = input.next();
        String[] parts = gameScore.split("[|:]" );
        String home, Visitor;
         home = parts[0];
         Visitor = parts[1];
         int score1, score2;
                 score1 = Integer.parseInt(parts[2]);
                 score2 = Integer.parseInt(parts[3]);
                 if (score1>score2){
                     System.out.println("Winner: "+home);
                 } else if (score2> score1){
                     System.out.println("Winner: "+Visitor);
                 }


    }

}
