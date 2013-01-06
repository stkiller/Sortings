package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class QuickSortTest extends GenericSortTest {

    @Override
    protected void initSorter() {
        algorithm = new QuickSort();
    }
}
