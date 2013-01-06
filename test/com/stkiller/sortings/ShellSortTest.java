package com.stkiller.sortings;

/**
 * @author apodoprigora (20/12/2012)
 */
public class ShellSortTest extends GenericSortTest {

    @Override
    protected void initSorter() {
        algorithm = new ShellSort();
    }
}
