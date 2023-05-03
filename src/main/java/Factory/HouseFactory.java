package Factory;

import Chores.Chore;
import Grocerys.Grocery;
import HouseBuild.House;
import HouseBuild.Storage;
import ToDoList.Task;

import java.util.ArrayList;

public class HouseFactory {


    public static House createNewBlankHouse(){

        ArrayList<Grocery> groceryList = new ArrayList<Grocery>();
        ArrayList<Storage> storages = new ArrayList<Storage>();
        ArrayList<Chore> choresList = new ArrayList<Chore>();
        ArrayList<Task> taskList = new ArrayList<Task>();

        House house = new House(groceryList, storages, choresList, taskList);
        return house;

    }

}
