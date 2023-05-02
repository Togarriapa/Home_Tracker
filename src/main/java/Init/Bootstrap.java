package Init;

import Chores.Chore;
import Grocerys.Grocery;
import HouseBuild.House;
import HouseBuild.Storage;
import ToDoList.Task;

import java.util.ArrayList;

public class Bootstrap {

    public Bootstrap(){

        runHouse();

    }

    public void runHouse(){

        ArrayList<Grocery>  groceryList = new ArrayList<Grocery>();
        ArrayList<Storage> storages = new ArrayList<Storage>();
        ArrayList<Chore> choresList = new ArrayList<Chore>();
        ArrayList<Task> taskList = new ArrayList<Task>();

        House house = new House(groceryList,storages,choresList,taskList);
        house.run();

    }

}
