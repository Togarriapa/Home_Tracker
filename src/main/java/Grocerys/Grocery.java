package Grocerys;

import GeneralInterfaces.Expenses;

import java.sql.Date;

public abstract class Grocery {

    protected String name;
    protected GrocerysCat category;
    protected Date expirationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GrocerysCat getCategory() {
        return category;
    }

    public void setCategory(GrocerysCat category) {
        this.category = category;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
