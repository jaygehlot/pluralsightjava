package com.pluralsight;

/**
 * Created by c1900406 on 09/06/2015.
 */
public enum CoffeeType {

    Espresso(8, 0),
    Latte(7, 227);

    private int requiredBeans;
    private int requiredMilk;

    CoffeeType(int requiredBeans, int requiredMilk){
        this.requiredBeans = requiredBeans;
        this.requiredMilk = requiredMilk;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }
}
