package Init;

import ClassResources.Menus;
import Factory.HouseFactory;
import HouseBuild.House;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import java.util.Scanner;

public class Bootstrap {
    private Prompt prompt;
    private Scanner scanner;
    private Boolean firstStarted = true;
    private Boolean isLoggedOn;
    private String password;
    private House house;

    public Bootstrap(){

        prompt = new Prompt(System.in, System.out);
        scanner = new Scanner(System.in);
        isLoggedOn = false;
        runHouse();

    }
    private void runHouse() {

        if (firstStarted) {
            firstStart();
            runHouse();

        } else {
            startMenu();

        }
    }

    private void firstStart(){
        house = HouseFactory.createNewBlankHouse();
        setFirstStarted();

    }
    private void startMenu() {
        MenuInputScanner scanner = new MenuInputScanner(Menus.startMenu);
        scanner.setMessage("****************************************\n" + "Choose your option:");

        int answerIndex = prompt.getUserInput(scanner);
        System.out.println("****************************************");
        getResultStartMenu(answerIndex);

    }

    private void getResultStartMenu(int answerIndex){
        switch (answerIndex) {

            case 1:
                System.out.println("You choose: LogIn");
                LogIn();

                break;
            case 2:
                System.out.println("You choose: Reset Home");
                resetHome();
                break;
        }
    }

    private void LogIn() {
        System.out.println("****************************************\n" + "Type your password:");
        String answerIndex = scanner.nextLine();

        if(answerIndex.equals(password)){

            System.out.println("****************************************\n" + "Welcome Home");
            Boolean isLoggedOn = true;
            house.run();

        }else{
            System.out.println("****************************************\n" + "Password Incorrect");
            LogIn();

        }
    }

    private void resetHome() {
        house = HouseFactory.createNewBlankHouse();

    }

    private void setFirstStarted(){

        System.out.println("****************************************\n" + "Choose your password:");
        String answerIndex = scanner.nextLine();
        System.out.println("****************************************");
        this.password = answerIndex;
        firstStarted = false;

    }


}
