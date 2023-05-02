package Init;

import Chores.Chore;
import Grocerys.Grocery;
import HouseBuild.House;
import HouseBuild.Storage;
import ToDoList.Task;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.ArrayList;

public class Bootstrap {

    private Boolean isLoggedOn;
    private Boolean firstStarted;
    private Prompt prompt;

    public Bootstrap(){

        prompt = new Prompt(System.in, System.out);

        firstStarted= true;

        runHouse();

    }
    public void runHouse() {

        if (firstStarted) {


            ArrayList<Grocery> groceryList = new ArrayList<Grocery>();
            ArrayList<Storage> storages = new ArrayList<Storage>();
            ArrayList<Chore> choresList = new ArrayList<Chore>();
            ArrayList<Task> taskList = new ArrayList<Task>();

            House house = new House(groceryList, storages, choresList, taskList);
            house.run();

        } else {

            startMenu();

        }


        private String[] optionsHome = {

                "LogIn / Load Home",
                "Reset Home"

        };

        public void startMenu() {

            MenuInputScanner scanner = new MenuInputScanner(optionsHome);
            scanner.setMessage("****************************************\n" + "Choose your option:");

            int answerIndex = prompt.getUserInput(scanner);
            System.out.println("****************************************");
            getResultStartMenu(answerIndex);

        }

        private void getResultStartMenu(int answerIndex){

            switch (answerIndex) {

                case 1:
                    System.out.println("You choose: LogIn / Load");
                    LogIn();

                    break;
                case 2:
                    System.out.println("You choose: Reset Home");
                    resetHome();
                    break;
            }

        }

        private void LogIn () {
        }

        private void resetHome () {

        }

    }
}
