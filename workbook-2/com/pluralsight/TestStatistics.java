package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args)  {
        int[] scores = {94, 57, 68, 84, 78, 85, 86, 97, 87, 82};

       int max=scores[0];
       int min=scores[0];
       int total=0;
       //Highest Score
        for(int i=1;i<scores.length;i++){
            if(scores[i]>max){
                max=scores[i];
            }
        }
        System.out.println("Highest Score is: " + max);
//Lowest Score
        for(int i=1;i<scores.length;i++){
            if(scores[i]<min){
                min =scores[i];
                break;
            }
        }
        System.out.println("Lowest Score is: " + min);

//Average Score
        for (int score : scores){
            total+=score;
        }
        int average = (int) total/scores.length;
        System.out.println("Average score is: "+ average);




    }
}