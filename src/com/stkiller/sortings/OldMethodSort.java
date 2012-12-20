package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class OldMethodSort extends SortingAlgorithm {

    public OldMethodSort() {
        super("Old Method Sort");
    }


    @Override
    public Comparable[] sort(final Comparable[] aArray) {
        if (aArray == null || aArray.length == 0) {
            return new Comparable[]{};
        }
        boolean swaped;
        do {
            swaped = false;
            for (int i = 1; i < aArray.length; i++) {
                if (isSmaller(aArray[i], aArray[i - 1])) {
                    exchange(aArray, i-1, i);
                    swaped = true;
                }
            }
        } while (swaped);
        return aArray;
    }
}
