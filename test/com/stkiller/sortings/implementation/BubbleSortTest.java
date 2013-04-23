package com.stkiller.sortings.implementation;

import com.stkiller.sortings.GenericSortTest;
import com.stkiller.sortings.implementation.BubbleSort;

/**
 * @author apodoprigora (20/12/2012)
 */
public class BubbleSortTest extends GenericSortTest {

    @Override
    protected void initSorter() {
        algorithm = new BubbleSort();
    }
}
