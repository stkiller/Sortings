package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class OldMethodSortTest extends SelectionSortTest {

    @Override
    protected void initSorter() {
        algorithm = new OldMethodSort();
    }
}
