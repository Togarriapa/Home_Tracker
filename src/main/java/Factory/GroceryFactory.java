package Factory;

import Grocerys.*;

public class GroceryFactory {

    public static Grocery createGrocery(PerishableCat isItPerishable){
        switch(isItPerishable){
            case PERISHABLE:
                return new FoodItem();
            case NON_PERISHABLE:
                return new Item();
            default:
                return null;
        }
    }
}
