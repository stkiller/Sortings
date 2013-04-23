package com.stkiller.sortings.implementation;

import com.stkiller.sortings.SortingAlgorithm;

/**
 * @author andrei (06/01/2013)
 */
public class MergeSort extends SortingAlgorithm {

    private Comparable[] aux;


    protected MergeSort() {
        super("Merge");
    }


    @Override
    public Comparable[] sort(final Comparable[] aArray) {
        if (aArray == null || aArray.length == 0) {
            return new Comparable[0];
        }
        aux = new Comparable[aArray.length];
        sort(aArray, 0, aArray.length - 1);
        return aArray;
    }


    private void sort(final Comparable[] aArray, final int lo, final int hi) {
        if (hi <= lo) {
            return;
        }
        final int mid = lo + (hi - lo) / 2;
        sort(aArray, lo, mid);       // Sort left half.
        sort(aArray, mid + 1, hi);     // Sort right half.
        merge(aArray, lo, mid, hi);  // Merge results (code on page 271).
    }


    public void merge(final Comparable[] aArray, final int lo, final int mid, final int hi) {
        int i = lo;
        int j = mid + 1;
        System.arraycopy(aArray, lo, aux, lo, hi + 1 - lo);
        for (int k = lo; k <= hi; k++)  // Merge back to a[lo..hi].
        {
            if (i > mid) {
                aArray[k] = aux[j++];
            } else if (j > hi) {
                aArray[k] = aux[i++];
            } else if (isSmaller(aux[j], aux[i])) {
                incrementExchanges();
                aArray[k] = aux[j++];
            } else {
                incrementExchanges();
                aArray[k] = aux[i++];
            }
        }
    }
}
