package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public abstract class SortingAlgorithm {

    private int comparisons;
    private int exchanges;
    private final String methodName;


    protected SortingAlgorithm(final String aMethodName) {
        methodName = aMethodName;
        comparisons = 0;
        exchanges = 0;
    }


    public abstract Comparable[] sort(Comparable[] a);

    protected boolean isSmaller(final Comparable aLeft, final Comparable aRight) {
        comparisons++;
        return aLeft.compareTo(aRight) <= 0;
    }


    protected void exchange(final Comparable[] aArray, final int aTo, final int aFrom) {
        incrementExchanges();
        final Comparable t = aArray[aTo];
        aArray[aTo] = aArray[aFrom];
        aArray[aFrom] = t;
    }


    protected void incrementExchanges() {
        exchanges++;
    }


    public int getComparisons() {
        return comparisons;
    }


    public int getExchanges() {
        return exchanges;
    }


    @Override
    public String toString() {
        return String.format("%-10s comparisons : %-4d exchanges : %-4d", methodName, getComparisons(),getExchanges());
    }
}
