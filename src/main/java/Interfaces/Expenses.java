package Interfaces;

import java.sql.Date;

public interface Expenses {

    void setPrice(double price);
    Double getPrice();

    void setCategory(String category);
    String getCategory();

    void setPurchaseDate(Date purchaseDate);
    Date getPurchaseDate();

}
