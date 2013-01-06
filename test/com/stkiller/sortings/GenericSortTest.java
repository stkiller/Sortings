package com.stkiller.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author apodoprigora (20/12/2012)
 */
public abstract class GenericSortTest {

    public static final int ARRAY_SIZE = 10;
    public static final Comparable[] SORTED_ARRAY = new Comparable[ARRAY_SIZE];
    public static final Comparable[] REVERSED_ARRAY = new Comparable[ARRAY_SIZE];
    public static Comparable[] RANDOM_ARRAY = new Comparable[ARRAY_SIZE];
    protected SortingAlgorithm algorithm;


    @BeforeClass
    public static void initArrays() {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            SORTED_ARRAY[i] = i;
            REVERSED_ARRAY[ARRAY_SIZE - 1 - i] = i;
        }
        final List<Comparable> randomList = new ArrayList<Comparable>(Arrays.asList(SORTED_ARRAY));
        Collections.shuffle(randomList);
        RANDOM_ARRAY = randomList.toArray(new Comparable[ARRAY_SIZE]);
    }


    @Before
    public void setUp() {
        initSorter();
    }


    protected abstract void initSorter();


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
    public void sort_nonSortedShortRandom() {
        final Comparable[] test = createCopyArray(RANDOM_ARRAY);
        final long start = System.nanoTime();
        final Comparable[] result = algorithm.sort(test);
        final long end = System.nanoTime();
        print("Random", end - start);
        assertArraysEquals(test, result, SORTED_ARRAY);
    }


    @Test
    public void sort_nonSortedShortReversed() {
        final Comparable[] test = createCopyArray(REVERSED_ARRAY);
        final long start = System.nanoTime();
        final Comparable[] result = algorithm.sort(test);
        final long end = System.nanoTime();
        print("Reversed", end - start);
        assertArraysEquals(test, result, SORTED_ARRAY);
    }


    @Test
    public void sort_AlreadySorted() {
        final Comparable[] test = createCopyArray(SORTED_ARRAY);
        final long start = System.nanoTime();
        final Comparable[] result = algorithm.sort(test);
        final long end = System.nanoTime();
        print("Sorted", end - start);
        System.out.println();
        assertArraysEquals(test, result, SORTED_ARRAY);
    }


    private Comparable[] createCopyArray(final Comparable[] aArray) {
        final Comparable[] test = new Comparable[aArray.length];
        System.arraycopy(aArray, 0, test, 0, test.length);
        return test;
    }


    private void print(final String aArrayType, final long aElapsedTime) {
        System.out.println(String.format("(%-10d)%-10s:%s", aElapsedTime, aArrayType, algorithm));
    }


    private void assertArraysEquals(final Comparable[] aTest, final Comparable[] aResult, final Comparable[] aExpected) {
        assertArrayNotNull(aResult);
        assertEquals(aTest.length, aResult.length);
        assertArrayEquals(aExpected, aResult);
    }


    private void assertArrayEmpty(final Comparable[] aResult) {
        assertEquals("The array should be empty", 0, aResult.length);
    }


    private void assertArrayNotNull(final Comparable[] aResult) {
        Assert.assertNotNull("The result should not be null", aResult);
    }

}
