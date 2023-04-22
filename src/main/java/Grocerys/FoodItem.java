package Grocerys;

import GeneralInterfaces.Perishable;

import java.sql.Date;

public class FoodItem extends Grocery implements Perishable {

    private Date expirationDate;

    @Override
    public void setExpirationDate(Date expirationDate) {

    }

    @Override
    public Date getExpirationDate() {
        return null;
    }
}
