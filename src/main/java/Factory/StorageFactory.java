package Factory;

import HouseBuild.Storage;

public class StorageFactory {

    public static Storage getNewStorage(){

        return new Storage();

    }
}
