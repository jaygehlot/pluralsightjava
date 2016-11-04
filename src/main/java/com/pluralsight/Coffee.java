package com.pluralsight;

/**
 * Created by c1900406 on 09/06/2015.
 */
public class Coffee {

    private final CoffeeType type;
    private final int beans;
    private final int milk;

    public Coffee(CoffeeType coffeeType, int beans, int milk){
        this.type = coffeeType;
        this.beans = beans;
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type=" + type +
                ", beans=" + beans +
                ", milk=" + milk +
                '}';
    }

    public CoffeeType getType() {
        return type;
    }

    public int getBeans(){
        return beans;
    }

    public int getMilk(){
        return milk;
    }


}


