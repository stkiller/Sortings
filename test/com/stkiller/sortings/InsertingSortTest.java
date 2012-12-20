package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class InsertingSortTest extends SelectionSortTest {

    @Override
    protected void initSorter() {
        algorithm = new InsertingSort();
    }
}
