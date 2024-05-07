package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1 = 0;
        int roll2 = 0;
        int counter2 = 0;
        int counter4 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int count = 1;
        int loop = 0;

        while (count <= 100) {
            loop += count;
            count++;
            roll1 = dice.roll();
            roll2 = dice.roll();
            System.out.println(new StringBuilder().append("Dice1: ").append(roll1).append(" +  Dice2")
                    .append(roll2).append(" =Sum: ").append((roll1 + roll2)).toString());
        }
        if (roll1 + roll2 == 2) {
            counter2++;
        } else if (roll1 + roll2 == 4) {
            counter4++;
        } else if (roll1 + roll2 == 6) {
            counter6++;}
              else if (roll1 + roll2 == 7) {
                counter7++;
            }
        System.out.println("Two counter: "+counter2);
        System.out.println("Four counter: "+counter4);
        System.out.println("Six counter: "+counter6);
        System.out.println("Seven counter: "+counter7);
        }
            public static class Dice {
                public static int roll() {
                    int randomNumber = (int) (Math.random() * 6) + 1;
                    return randomNumber;
                }
            }


    }


