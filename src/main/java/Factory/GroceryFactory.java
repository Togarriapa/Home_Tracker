package Factory;

import Grocerys.*;

public class GroceryFactory {

    public static Grocery createGrocery(){

        //Prompt if perishable


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
