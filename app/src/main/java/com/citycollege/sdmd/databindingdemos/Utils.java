package com.citycollege.sdmd.databindingdemos;

import java.text.DecimalFormat;

public final class Utils {
    private Utils() {}

    public static String formatDecimal(double decimal) {
        return new DecimalFormat("#0.00").format(decimal);
    }
}
