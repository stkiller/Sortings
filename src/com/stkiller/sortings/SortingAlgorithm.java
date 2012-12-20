package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public abstract class SortingAlgorithm {

    private int comparations;
    private int exchanges;
    private String methodName;


    protected SortingAlgorithm(final String aMethodName) {
        methodName = aMethodName;
        comparations = 0;
        exchanges = 0;
    }


    public abstract Comparable[] sort(Comparable[] a);

    protected boolean isSmaller(final Comparable aLeft, final Comparable aRight) {
        comparations++;
        return aLeft.compareTo(aRight) <= 0;
    }


    protected void exchange(final Comparable[] aArray, final int aTo, final int aFrom) {
        exchanges++;
        final Comparable t = aArray[aTo];
        aArray[aTo] = aArray[aFrom];
        aArray[aFrom] = t;
    }


    public int getComparations() {
        return comparations;
    }


    public int getExchanges() {
        return exchanges;
    }


    @Override
    public String toString() {
        return methodName + ", comparations : " + getComparations() + ", exchanges : " + getExchanges();
    }
}
