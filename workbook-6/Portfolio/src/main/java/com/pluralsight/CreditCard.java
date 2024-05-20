package com.pluralsight;

public class CreditCard implements Valuable {
   private String name;
   private String accountNum;
   private double amount;

   public CreditCard(String name, String accountNum, double amount) {
      this.name = name;
      this.accountNum = accountNum;
      this.amount = amount;
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

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public void charge(double amount){

   }

   public void pay(double amount){

   }


   @Override
   public void getValue() {

   }
}
