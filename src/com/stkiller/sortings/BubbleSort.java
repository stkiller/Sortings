package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class BubbleSort extends SortingAlgorithm {

    public BubbleSort() {
        super("Bubble");
    }


    @Override
    public Comparable[] sort(final Comparable[] aArray) {
        if (aArray == null || aArray.length == 0) {
            return new Comparable[]{};
        }
        boolean swaped;
        do {
            swaped = false;
            for (int i = aArray.length-1; i>0; i--) {
                if (isSmaller(aArray[i], aArray[i - 1])) {
                    exchange(aArray, i-1, i);
                    swaped = true;
                }
            }
        } while (swaped);
        return aArray;
    }
}
