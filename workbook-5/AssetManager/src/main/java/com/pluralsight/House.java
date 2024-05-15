package AssetManager.src.main.java.com.pluralsight;

public class House extends Asset {
    //Private attributes
    private String address;
    private int condition;
    private int perSquareFt;
    private int lotSize;

    //Constructor, calling the super method from the Asset class.
    public House(String address, int condition, int perSquareFt, int lotSize, String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.perSquareFt = perSquareFt;
        this.lotSize = lotSize;
    }
    //Another constructor for just the House description and not the Asset information in case they need to be separated. Not sure if I need it.
    public House(String description, String dateAcquired, double originalCost){
        super(description, dateAcquired, originalCost);
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", condition=" + condition +
                ", perSquareFt=" + perSquareFt +
                ", lotSize=" + lotSize +
                '}';
    }

    //Getters and setters for all attributes
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
// getValue method that tracks how much every sqft cost.
    //And tells the user what condition the house is in and sets the condition based on the persquare footage.
   public double getValue(){
        //If Statement : persquareft is greater than or equal to 180. House Value is excellent-Condition is 4
       /* persquareft is less than or equal to 130 AND greater than 90. House value is good - Condition is 3
        persquareft is less than or equal to 90 And greater than 80. House Value is fair- Condition 2
        persquareft less than 80 House Value is poor - condition 1
        */
        if(perSquareFt >= 180.00){
            System.out.println("House Value is Excellent");
            setCondition(4);;

        } else if (perSquareFt <= 130.00 && perSquareFt > 90) {
            System.out.println("House Value is good");
            setCondition(3);

        } else if (perSquareFt <= 90 && perSquareFt > 80){
            System.out.println("House Value is fair");
            setCondition(2);
        } else if (perSquareFt < 80) {
            System.out.println("House Value is poor");
            setCondition(1);
       }
     return perSquareFt;
   }
}
