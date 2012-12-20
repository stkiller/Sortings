package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class InsertingSort extends SortingAlgorithm {

    public InsertingSort() {
        super("Insertion Sort");
    }


    @Override
    public Comparable[] sort(final Comparable[] aArray) {
        if (aArray == null || aArray.length == 0) {
            return new Comparable[]{};
        }
        for (int i = 0; i < aArray.length; i++) {
            for (int j = i; j > 0 && isSmaller(aArray[j], aArray[j - 1]); j--) {
                exchange(aArray, j - 1, j);
            }
        }
        return aArray;
    }
}
