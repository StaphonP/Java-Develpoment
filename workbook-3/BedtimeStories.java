import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        FileInputStream fis;
        Scanner input = new Scanner(System.in);
        System.out.println("What story would you like to read? ");
        String storyChoice= input.next();
        try{
            fis = new FileInputStream(storyChoice);
            input = new Scanner(fis);

            while(input.hasNextLine()){
                String lines = input.nextLine();
                System.out.println(lines);
            }
            input.close();
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found: " + storyChoice);
            e.printStackTrace();
        }

    }
}