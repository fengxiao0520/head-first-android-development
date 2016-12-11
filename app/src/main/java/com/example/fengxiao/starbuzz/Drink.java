package com.example.fengxiao.starbuzz;

/**
 * Created by fengxiao on 16/12/6.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.icon01),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.icon02),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.icon03)
    };
    public static final String[] drinknames = {
            "Latte", "Cappuccino", "Filter"
    };


    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
