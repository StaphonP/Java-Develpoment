package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount staphon = new BankAccount("Checking","27364599",500.00);
        Valuable staphon2 = new BankAccount("Checking", "76548970", 750.00);
        staphon.deposit(200);


    }
}
