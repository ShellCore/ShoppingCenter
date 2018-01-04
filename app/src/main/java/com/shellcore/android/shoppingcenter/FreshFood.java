package com.shellcore.android.shoppingcenter;

/**
 * Created by MOGC on 04/01/2018.
 */

public class FreshFood implements Item {

    private int costPerKilo;
    private int weight;
    private String name;

    public FreshFood(int costPerKilo, int weight, String name) {
        this.costPerKilo = costPerKilo;
        this.weight = weight;
        this.name = name;
    }

    public int getCostPerKilo() {
        return costPerKilo;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
