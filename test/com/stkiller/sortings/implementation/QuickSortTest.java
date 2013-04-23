package com.stkiller.sortings.implementation;

import com.stkiller.sortings.GenericSortTest;
import com.stkiller.sortings.implementation.QuickSort;

/**
 * @author apodoprigora (20/12/2012)
 */
public class QuickSortTest extends GenericSortTest {

    @Override
    protected void initSorter() {
        algorithm = new QuickSort();
    }
}
