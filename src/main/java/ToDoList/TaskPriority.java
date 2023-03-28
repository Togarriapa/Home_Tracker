package ToDoList;

import GeneralInterfaces.GeneralPriority;

public enum TaskPriority implements GeneralPriority {

    EMERGENCY,
    VERY_IMPORTANT,
    IMPORTANT,
    NORMAL,
    NOT_IMPORTANT,
    NULL;

}
