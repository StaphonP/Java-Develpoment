package com.pluralsight;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PayrollCalculator {
    public static void main(String[] args) {

      /* try {
            BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
            String file = br.readLine();
            Employee newUser = new Employee(45, "Staphon Peterson", 45, 32);
            while ((file = br.readLine()) != null) {
                String[] tokens = file.split(Pattern.quote("|"));
                System.out.println(file);


            }
            System.out.println("New User Id: " + newUser.getEmployeeId() + "\n New User Name: " + newUser.getName() + "\n New User Hours Worked: " +
                    +newUser.getHoursWorked() + "\n New User Pay Rate: " + newUser.getPayRate() + "\n Gross pay: " + newUser.getGrossPay());

        } catch (IOException e) {
            System.out.println("I did not find your file.");
        }/*

       */

        try {

            FileWriter fw = new FileWriter("staphon.csv");
            BufferedWriter bw = new BufferedWriter(fw);

            fw.write("id|name|grosspay\n" +
                    "111| Cameron Tay|3277.65\n" +
                    "222|James Tee| 2150.00\n");

            for (int i = 1; i <= 10; i++) {
                String text = String.format("Counting %d\n", i);
                bw.write(text);
            }
            bw.close();
            fw.close();

            } catch(IOException e){
                System.out.println("ERROR: An unexpected error occurred");
                e.getStackTrace();
            }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the employee file to process: \n");
        String eFile = input.next();
        System.out.println("Enter the name of the payroll file to create: \n");
        String pFile = input.next();
        try {
            FileReader employeeFile = new FileReader(eFile);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
        try {
            FileWriter payrollFile = new FileWriter(pFile);
        } catch (IOException e) {
            e.getStackTrace();

        }
    }
    }


