package com.stkiller.sortings.implementation;

import com.stkiller.sortings.SortingAlgorithm;

/**
 * @author apodoprigora (20/12/2012)
 */
public class ShellSort extends SortingAlgorithm {

    public ShellSort() {
        super("Shell");
    }


    @Override
    public Comparable[] sort(final Comparable[] aArray) {
        if (aArray == null || aArray.length == 0) {
            return new Comparable[]{};
        }
        int h = 1;
        while (h < aArray.length / 3) {
            h = 3*h+1;
        }
        while (h >= 1) {
            for (int i = h; i < aArray.length; i++) {
                for (int j = i; j >= h && isSmaller(aArray[j], aArray[j - h]); j-=h) {
                    exchange(aArray, j-h, j);
                }
            }
            h=h/3;
        }
        return aArray;
    }
}
