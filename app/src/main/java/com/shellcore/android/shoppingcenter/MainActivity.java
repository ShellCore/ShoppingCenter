package com.shellcore.android.shoppingcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item[] items = new Item[] {
                new CannedFood(120, "Coca-Cola"),
                new FreshFood(60, 2, "Platanos"),
                new FreshFood(55, 4, "Tomates"),
                new CannedFood(185, "Leche en polvo")
        };

        int total = totalCost(items);

        Log.d(TAG, "Precio total de la compra: " + total);
    }

    private int totalCost(Item... items) {
        Visitor visitor = new Checkout();
        int total = 0;
        for (Item i : items) {
            System.out.println();
            total += i.accept(visitor);
        }

        return total;
    }
}
