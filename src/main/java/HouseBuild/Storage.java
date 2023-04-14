package HouseBuild;

import Factory.GroceryFactory;
import Grocerys.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private String name;
    private List<Grocery> storedGrocerys;

    public Storage(){

        storedGrocerys = new ArrayList<Grocery>();

    }

    public void addGrocery(){ //Adds a grocery to storage.

        storedGrocerys.add(GroceryFactory.createGrocery());

    }
    public Grocery getGrocery(int index){ //Gets the grocery by index: mainly used if item has multiple portions.

        return storedGrocerys.get(index);

    }
    public Grocery useRemoveGrocery(int index){ //Removes Grocery from the list while returning it.

        Grocery groceryToBeRemoved = storedGrocerys.get(index);
        storedGrocerys.remove(index);
        return groceryToBeRemoved;

    }

    public void listGrocerys(){ //Lists all Grocerys from the list, and it's expirationDates.
        int index = 0;
        System.out.println("Groceries Stored in " + name + ":");
        for (Grocery grocery: storedGrocerys) {
            System.out.println( index + " - " + grocery.getName() + ": Exp. " + grocery.getExpirationDate());
            index++;
        }

    }

    public String getName() { // Returns Storage name
        return name;
    }

    public void setName(String name) { //Changes Storage Name
        this.name = name;
    }

    public List<Grocery> getStoredGrocerys() { //Returns List of Stored Grocerys for Expiration date scanning and other processes
        return storedGrocerys;
    }

}
