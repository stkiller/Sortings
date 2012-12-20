package com.stkiller.sortings;

import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * @author apodoprigora (20/12/2012)
 */
public class SelectionSortTest {

    protected SortingAlgorithm algorithm;

    @Before
    public void beforeClass() {
        initSorter();
    }


    protected void initSorter() {
        algorithm = new SelectionSort();
    }


    @Test
    public void sort_emptyArray() {
        final Comparable[] result = algorithm.sort(new Integer[]{});
        assertArrayNotNull(result);
        assertArrayEmpty(result);
    }


    @Test
    public void sort_nullArray() {
        final Comparable[] result = algorithm.sort(null);
        assertArrayNotNull(result);
        assertArrayEmpty(result);
    }
    
    @Test
    public void sort_nonSortedShortReversed() {
        final Comparable[] test = new Comparable[]{5,4 ,3, 2, 1};
        final Comparable[] result = algorithm.sort(test);
        assertArrayNotNull(result);
        assertEquals(test.length, result.length);
        assertArrayEquals(new Comparable[]{1, 2, 3, 4, 5}, result);
        System.out.println("Reversed\n"+algorithm);
    }

    @Test
    public void sort_nonSortedShortRandom(){
        final Comparable[] test = new Comparable[]{3, 1, 2, 5, 4};
        final Comparable[] result = algorithm.sort(test);
        assertArrayNotNull(result);
        assertEquals(test.length, result.length);
        assertArrayEquals(new Comparable[]{1, 2, 3, 4, 5}, result);
        System.out.println("Random\n" + algorithm);
    }

    @Test
    public void sort_AlreadySorted(){
        final Comparable[] test = new Comparable[]{1,2,3, 4,5};
        final Comparable[] result = algorithm.sort(test);
        assertArrayNotNull(result);
        assertEquals(test.length, result.length);
        assertArrayEquals(new Comparable[]{1, 2, 3, 4, 5}, result);
        System.out.println("Sorted\n" + algorithm);
    }


    private void assertArrayEmpty(final Comparable[] aResult) {
        assertEquals("The array should be empty", 0, aResult.length);
    }


    private void assertArrayNotNull(final Comparable[] aResult) {
        Assert.assertNotNull("The result should not be null", aResult);
    }

}
