package com.shellcore.android.shoppingcenter;

import android.util.Log;

/**
 * Created by MOGC on 04/01/2018.
 */

public class Checkout implements Visitor {

    private static final String TAG = "Checkout";

    @Override
    public int visit(CannedFood cannedFood) {
        int cost = cannedFood.getCost();
        String name = cannedFood.getName();
        Log.d(TAG, "Envase: " + name + ", Precio: " + cost);
        return cost;
    }

    @Override
    public int visit(FreshFood freshFood) {
        int cost = freshFood.getCostPerKilo() * freshFood.getWeight();
        String name = freshFood.getName();
        Log.d(TAG, "Comida fresca: " + name + ", Precio: " + cost);
        return cost;
    }

    @Override
    public int visit(SpecialOffer specialOffer) {
        String name = specialOffer.getName();
        int cost = specialOffer.getBaseCost();
        int number = specialOffer.getQuantity();
        int discount = specialOffer.getDiscount();

        cost *= number;

        if (number > 1) {
            cost = ((100 - discount) * cost) / 100;
        }

        Log.d(TAG, "Oferta del día: " + name + " al " + discount + "%, Precio: " + cost);
        
        return cost;
    }
}
