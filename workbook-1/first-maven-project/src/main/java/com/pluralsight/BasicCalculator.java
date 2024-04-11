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


        if(math.equals("A")); {
          System.out.println(fNum + sNum);
        }  if(math.equals("S"));{
            System.out.println(fNum - sNum);
        }   if(math.equals("M"));{
            System.out.println(fNum * sNum);
        }   if(math == "D"); {
            System.out.println(fNum / sNum);
        }


    }
}
