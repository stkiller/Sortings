package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class InsertingSortTest extends GenericSortTest {

    @Override
    protected void initSorter() {
        algorithm = new InsertingSort();
    }
}
