package Factory;

import Grocerys.*;

import java.util.Scanner;

public class GroceryFactory {



    public static Grocery createGrocery(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************/n" + "Is this Grocery Perishable? y/n");
        String answer = scanner.nextLine();

        PerishableCat isItPerishable;

        if(answer.equalsIgnoreCase("y")){
            isItPerishable = PerishableCat.PERISHABLE;
        }else if( answer.equalsIgnoreCase("n")){
            isItPerishable = PerishableCat.NON_PERISHABLE;
        }else{
            isItPerishable = null;
        }

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
