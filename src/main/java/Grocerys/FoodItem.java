package Grocerys;

import Interfaces.Perishable;

import java.sql.Date;

public class FoodItem extends Grocery implements Perishable {
    @Override
    public void setValidateDate(Date validateDate) {

    }

    @Override
    public Date getValidateDate() {
        return null;
    }
}
