import java.util.InputMismatchException;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        //Create an array of 10 famous quotes.
        String[] quotes = new String[10];
        quotes[0] = "The only way to do great work is to love what you do. - Steve Jobs";
        quotes[1] = "In the end, it's not the years in your life that count. It's the life in your years. - Abraham Lincoln";
        quotes[2] = "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela";
        quotes[3] = "The only thing necessary for the triumph of evil is for good men to do nothing. - Edmund Burke";
        quotes[4] = "Darkness cannot drive out darkness; only light can do that. Hate cannot drive out hate; only love can do that. - Martin Luther King Jr.";
        quotes[5] = "Life is what happens when you're busy making other plans. - John Lennon";
        quotes[6] = "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt";
        quotes[7] = "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill";
        quotes[8] = "In three words I can sum up everything I've learned about life: It goes on. - Robert Frost";
        quotes[9] = "You miss 100% of the shots you don't take. - Wayne Gretzky";

        //Prompt user to enter a number 1-10 and display that quote
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number 1-10 for a quote: ");
        //try and catch mismatch exception
        try{
        int command1 = input.nextInt();

            if (command1 == 1) {
                System.out.println(quotes[0]);
            } else if (command1 == 2) {
                System.out.println(quotes[1]);
            } else if (command1 == 3) {
                System.out.println(quotes[2]);
            } else if (command1 == 4) {
                System.out.println(quotes[3]);
            } else if (command1 == 5) {
                System.out.println(quotes[4]);
            } else if (command1 == 6) {
                System.out.println(quotes[5]);
            } else if (command1 == 7) {
                System.out.println(quotes[6]);
            } else if (command1 == 8) {
                System.out.println(quotes[7]);
            } else if (command1 == 9) {
                System.out.println(quotes[8]);
            } else if (command1 == 10) {
                System.out.println(quotes[9]);
            }
        } catch(InputMismatchException e) {
            System.out.println("Cannot enter letters here!");
        }
        }

        }


