package GeneralInterfaces;

import Grocerys.GrocerysCat;

import java.sql.Date;

public interface Expenses {

    void setPrice(double price);
    Double getPrice();

    void setCategory(GrocerysCat category);
    GrocerysCat getCategory();

    void setPurchaseDate(Date purchaseDate);
    Date getPurchaseDate();

}
