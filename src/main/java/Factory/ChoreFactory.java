package Factory;

import Chores.Chore;

public class ChoreFactory {

    public static Chore getNewChore(){

        return new Chore();

    }

}
