package HouseBuild;

import Chores.Chore;
import Factory.ChoreFactory;
import Factory.StorageFactory;
import Factory.TaskFactory;
import Grocerys.Grocery;
import ToDoList.Task;


import java.util.*;

public class House {

    private List<Grocery> groceryLists;
    private List<Storage> storages;
    private List<Chore> choresList;
    private List<Task> taskList;


    public House(){

        groceryLists = new ArrayList<Grocery>();
        storages = new ArrayList<Storage>();
        choresList = new ArrayList<Chore>();
        taskList = new ArrayList<Task>();

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
}
