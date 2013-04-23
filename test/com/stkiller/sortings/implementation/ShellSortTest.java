package com.stkiller.sortings.implementation;

import com.stkiller.sortings.GenericSortTest;
import com.stkiller.sortings.implementation.ShellSort;

/**
 * @author apodoprigora (20/12/2012)
 */
public class ShellSortTest extends GenericSortTest {

    @Override
    protected void initSorter() {
        algorithm = new ShellSort();
    }
}
