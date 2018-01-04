package com.shellcore.android.shoppingcenter;

/**
 * Created by MOGC on 04/01/2018.
 */

public class CannedFood implements Item {

    private int cost;
    private String name;

    public CannedFood(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
