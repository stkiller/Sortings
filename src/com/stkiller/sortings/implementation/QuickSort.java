package com.stkiller.sortings.implementation;

import java.util.Arrays;
import java.util.Collections;

import com.stkiller.sortings.SortingAlgorithm;

/**
 * @author andrei (06/01/2013)
 */
public class QuickSort extends SortingAlgorithm {

    protected QuickSort() {
        super("Quick");
    }


    @Override
    public Comparable[] sort(final Comparable[] aArray) {
        if (aArray == null || aArray.length == 0) {
            return new Comparable[0];
        }
        Collections.shuffle(Arrays.asList(aArray));
        sort(aArray, 0, aArray.length - 1);
        return aArray;
    }


    private void sort(final Comparable[] aArray, final int lo, final int hi) {
        if (hi <= lo) {
            return;
        }
        final int j = partition(aArray, lo, hi); // Partition (see page 291).
        sort(aArray, lo, j - 1);    // Sort left part a[lo .. j-1].
        sort(aArray, j + 1, hi);    // Sort right part a[j+1 .. hi].
    }


    private int partition(final Comparable[] a, final int lo, final int hi) {
        int i = lo;
        int j = hi + 1;
        final Comparable v = a[lo];            // partitioning item
        while (true) {  // Scan right, scan left, check for scan complete, and exchange.
            while (isSmaller(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (isSmaller(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exchange(a, i, j);
        }
        exchange(a, lo, j);       // Put v = a[j] into position
        return j;             // with a[lo..j-1] <= a[j] <= a[j+1..hi].
    }
}
