package com.pluralsight;


import java.util.Scanner;

public class BasicCalculator{

    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    double fNum, sNum;
    String math;
    System.out.print("Enter the first number: ");
    fNum = myScanner.nextInt();
    System.out.print("Enter the second number here: ");
    sNum= myScanner.nextInt();
    System.out.print("(A)dd, (S)ubtract, (M)ultiply, or (D)ivide?: ");
    math = myScanner.next();
    double answer = 0;


        if(math.equals("A")); {
          answer = (fNum + sNum);
          System.out.println(fNum + sNum);

        }   if(math.equals("S"));{
            answer = (fNum - sNum);
            System.out.println(fNum - sNum);
        }   if(math.equals("M"));{
            answer = (fNum * sNum);
            System.out.println(fNum * sNum);
        }   if (math.equals("D")); {
            answer = (fNum / sNum);
            System.out.print(fNum / sNum);
        }


    }
}
