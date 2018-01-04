package com.shellcore.android.shoppingcenter;

/**
 * Created by MOGC on 04/01/2018.
 */

public class SpecialOffer implements Item {

    private int baseCost;
    private int quantity;
    private String name;
    private int discount;

    public SpecialOffer(int baseCost, int quantity, String name, int discount) {
        this.baseCost = baseCost;
        this.quantity = quantity;
        this.name = name;
        this.discount = discount;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getBaseCost() {
        return baseCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }
}
