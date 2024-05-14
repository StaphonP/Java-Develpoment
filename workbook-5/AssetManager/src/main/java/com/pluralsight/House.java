package AssetManager.src.main.java.com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int perSquareFt;
    private int lotSize;

    public House(String address, int condition, int perSquareFt, int lotSize, String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.perSquareFt = perSquareFt;
        this.lotSize = lotSize;
    }
    public House(String description, String dateAcquired, double originalCost){
        super(description, dateAcquired, originalCost);
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getPerSquareFt() {
        return perSquareFt;
    }

    public void setPerSquareFt(int PersquareFt) {
        this.perSquareFt = perSquareFt;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

   public double getValue(){
        String value;
        if(perSquareFt >= 180.00){
            System.out.println("House Value is Excellent");

        } else if (perSquareFt <= 130.00 && perSquareFt > 90) {
            System.out.println("House Value is good");

        } else if (perSquareFt <= 90 && perSquareFt > 80){
            System.out.println("House Value is fair");

        } else if (perSquareFt < 80) {
            System.out.println("House Value is poor");

       }
     return perSquareFt;
   }
}
