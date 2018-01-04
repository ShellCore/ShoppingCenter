package com.shellcore.android.shoppingcenter;

/**
 * Created by MOGC on 04/01/2018.
 */

public interface Visitor {

    int visit(CannedFood cannedFood);
    int visit(FreshFood freshFood);
}
