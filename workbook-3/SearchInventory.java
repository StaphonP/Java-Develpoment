import com.pluralsight.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
        System.out.println(inventory);


    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            FileReader fr = new FileReader("inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }  return inventory;



    }
}
       /* ArrayList<Product> inventory = new ArrayList<Product>();
        Product burger = new Product(1,"Cheeseburger", 7.50f);
        Product cheeseSticks= new Product(2, "Cheese Sticks", 2.50f);
        Product fries = new Product(3, "Fries", 2.50f);
        Product chickenTenders = new Product(4,"Chicken Tenders 5pc.", 6.99f);
        Product pizza = new Product(5,"Pizza", 10.00f);
        inventory.add(burger);
        inventory.add(cheeseSticks);
        inventory.add(fries);
        inventory.add(chickenTenders);
        inventory.add(pizza);
        return inventory;
          */





