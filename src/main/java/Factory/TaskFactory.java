package Factory;

import ToDoList.Task;

public class TaskFactory {

    public static Task getNewTask(){

        return new Task();

    }

}
