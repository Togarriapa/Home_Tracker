package HouseBuild;

import Chores.Chore;
import Factory.ChoreFactory;
import Factory.StorageFactory;
import Factory.TaskFactory;
import Grocerys.Grocery;
import ToDoList.Task;
import org.academiadecodigo.bootcamp.Prompt;

import java.util.*;

public class House implements Runnable {

    private List<Grocery> groceryLists;
    private List<Storage> storages;
    private List<Chore> choresList;
    private List<Task> taskList;
    private boolean keepRunning;

    public House(List<Grocery> groceryLists, List<Storage> storages, List<Chore> choresList, List<Task> taskList){
        this.groceryLists = new ArrayList<Grocery>();
        this.storages = new ArrayList<Storage>();
        this.choresList = new ArrayList<Chore>();
        this.taskList = new ArrayList<Task>();

        keepRunning = true;

    }

    @Override
    public void run() {
        while(keepRunning) {
            Menu();
        }

    }
    public void Menu(){


    }


    private void addStorage(){

        storages.add(StorageFactory.getNewStorage());

    }

    private void addChore(){

        choresList.add(ChoreFactory.getNewChore());

    }

    private void addTask(){

        taskList.add(TaskFactory.getNewTask());

    }

    private void addGroceryToList(Grocery grocery){

        groceryLists.add(grocery);

    }


}
