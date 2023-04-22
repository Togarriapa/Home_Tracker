package HouseBuild;

import Chores.Chore;
import Factory.ChoreFactory;
import Factory.StorageFactory;
import Factory.TaskFactory;
import Grocerys.Grocery;
import ToDoList.Task;
import java.util.*;

public class House implements Runnable {

    private List<Grocery> groceryLists;
    private List<Storage> storages;
    private List<Chore> choresList;
    private List<Task> taskList;
    private boolean keepRunning;

    public House(){

        groceryLists = new ArrayList<Grocery>();
        storages = new ArrayList<Storage>();
        choresList = new ArrayList<Chore>();
        taskList = new ArrayList<Task>();
        keepRunning = true;

    }

    public void addStorage(){

        storages.add(StorageFactory.getNewStorage());

    }

    public void addChore(){

        choresList.add(ChoreFactory.getNewChore());

    }

    public void addTask(){

        taskList.add(TaskFactory.getNewTask());

    }

    public void addGroceryToList(Grocery grocery){

        groceryLists.add(grocery);

    }

    public void Menu(){



    }

    @Override
    public void run() {
        while(keepRunning) {
            Menu();
        }

    }
}
