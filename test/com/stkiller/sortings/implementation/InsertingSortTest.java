package com.stkiller.sortings.implementation;

import com.stkiller.sortings.GenericSortTest;
import com.stkiller.sortings.implementation.InsertingSort;

/**
 * @author apodoprigora (20/12/2012)
 */
public class InsertingSortTest extends GenericSortTest {

    @Override
    protected void initSorter() {
        algorithm = new InsertingSort();
    }
}
