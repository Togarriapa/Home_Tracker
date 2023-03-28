package GeneralInterfaces;

import java.util.Optional;

public interface Task {

    void setState();
    Optional<GeneralState> getState();

    void setPriority();
    Optional<GeneralPriority> getPriority();


}
