package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class SelectionSort extends SortingAlgorithm {

    public SelectionSort() {
        super("Selection");
    }


    @Override
    public Comparable[] sort(final Comparable[] aArray) {
        if (aArray == null || aArray.length == 0) {
            return new Comparable[]{};
        }
        for (int i = 0; i < aArray.length; i++) {
            int min = i;
            for (int j = i + 1; j < aArray.length; j++) {
                if (isSmaller(aArray[j], aArray[min])) {
                    min = j;
                }
            }
            exchange(aArray, i, min);
        }
        return aArray;
    }
}
