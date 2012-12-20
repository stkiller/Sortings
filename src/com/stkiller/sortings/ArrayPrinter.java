package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class ArrayPrinter {

    public void printArray(final Object[] aArray) {
        System.out.print("[");
        for (final Object item : aArray) {
            System.out.print(" " + item + ",");
        }
        System.out.print("]\n");
    }

}
