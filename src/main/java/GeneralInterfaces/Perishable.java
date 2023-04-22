package GeneralInterfaces;

import java.sql.Date;

public interface Perishable {

    void setExpirationDate(Date validateDate);
    Date getExpirationDate();

}
