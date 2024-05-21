package com.pluralsight;

public class CreditCard implements Valuable {
   private String name;
   private String accountNum;
   private double balance;

   public CreditCard(String name, String accountNum, double balance) {
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

   public void setBalance() {
      this.balance = balance;
   }

   public void charge(double amount){
   balance -= amount;
   }

   public void pay(double amount){
balance += amount;
   }


   @Override
   public double getValue() {
   return balance;
   }
}
