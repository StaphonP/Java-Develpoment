package com.pluralsight;



public class CellPhone {
   //Instance variables | Objects
   private long serialNum;
   private String model;
   private String carrier;
   private String phoneNum;
   private String owner;
   private String dial;

   public CellPhone() {
      serialNum = 0;
      model = "";
      carrier = "";
      owner = "";
      dial = "";
      phoneNum = "";
   }

   CellPhone(int serialNum,String model,String carrier,String owner,String dial, String phoneNum){
      this.serialNum = serialNum;
      this.owner = owner;
      this.carrier = carrier;
      this.model = model;
      this.dial = dial;
      this.phoneNum = phoneNum;
   }

   public double getSerialNum() {
      return serialNum;
   }

   public void setSerialNum(long serialNum) {
      this.serialNum = serialNum;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getCarrier() {
      return carrier;
   }

   public void setCarrier(String carrier) {
      this.carrier = carrier;
   }

   public String getPhoneNum() {
      return phoneNum;
   }

   public void setPhoneNum(String phoneNum) {
      this.phoneNum = phoneNum;
   }

   public String getOwner() {
      return owner;
   }
   public void setOwner(String owner){
      this.owner = owner;
   }

   public void setDial(String dial) {
      this.dial = dial;
   }
   public String dial(String phoneNum) {
      return (getOwner()+ "'s phone is calling "+ dial);
   }


}


