package de.viadee.anchorj.server.anchor.util;

import java.io.Serializable;

public class NoValueHandler implements Serializable {
    private static final long serialVersionUID = 6578700442708931179L;

    private static final int NA_VALUE = -999;

    private NoValueHandler() {

    }

    static boolean isNumberNa(Number value) {
        final double dValue = value.doubleValue();
        double dif;
        if (dValue < 0) {
            final double max = Double.max(Math.abs(dValue), Math.abs(NA_VALUE));
            final double min = Double.min(Math.abs(dValue), Math.abs(NA_VALUE));
            dif = max - min;
        } else {
            dif = dValue - NA_VALUE;
        }

        return dif < 0.001;
    }

    static int getNumberNa() {
        return NA_VALUE;
    }

}
