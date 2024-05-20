package com.pluralsight;

public class BankAccount implements Valuable {
    private String name;
    private String accountNum;
    private double balance;

    public BankAccount(String name, String accountNum, double balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount){

    }

    public void deposit(double amount){
     if(amount > 0) {
         balance += amount;
         System.out.println(amount + " was just deposited");
         System.out.println("New Balance: "+ balance);
     } else {
         System.out.println("Invalid deposit number. Try again.");
     }
    }

    @Override
    public void getValue() {

    }
}
