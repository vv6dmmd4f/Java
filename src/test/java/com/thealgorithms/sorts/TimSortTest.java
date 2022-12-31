package com.thealgorithms.sorts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimSortTest {

    private TimSort timSort;

    @BeforeEach
    void setUp() {
        timSort = new TimSort();
    }

    @Test
    void shouldAcceptWhenEmptyArrayIsPassed() {
        Integer [] array = new Integer[]{};
        Integer [] expected = new Integer[]{};

        Integer []sorted = timSort.sort(array);

        assertArrayEquals(expected, sorted);
    }

    @Test
    void shouldAcceptWhenSingleValuedArrayIsPassed() {
        Integer [] array = new Integer[]{2};
        Integer [] expected = new Integer[]{2};

        Integer [] sorted = timSort.sort(array);

        assertArrayEquals(expected, sorted);
    }

    @Test
    void shouldAcceptWhenArrayWithAllPositiveValuesIsPassed() {
        Integer [] array = new Integer[]{60, 7, 55, 9, 999, 3};
        Integer [] expected = new Integer[]{3, 7, 9, 55, 60, 999};

        Integer [] sorted = timSort.sort(array);

        assertArrayEquals(expected, sorted);
    }

    @Test
    void shouldAcceptWhenArrayWithAllNegativeValuesIsPassed() {
        Integer [] array = new Integer[]{-60, -7, -55, -9, -999, -3};
        Integer [] expected = new Integer[]{-999, -60, -55, -9, -7, -3};

        Integer [] sorted = timSort.sort(array);

        assertArrayEquals(expected, sorted);
    }

    @Test
    void shouldAcceptWhenArrayWithRealNumberValuesIsPassed() {
        Integer [] array = new Integer[]{60, -7, 55, 9, -999, -3};
        Integer [] expected = new Integer[]{-999, -7, -3, 9, 55, 60};

        Integer [] sorted = timSort.sort(array);

        assertArrayEquals(expected, sorted);
    }

    @Test
    void shouldAcceptWhenArrayWithDuplicateValueIsPassed() {
        Integer [] array = new Integer[]{60, 7, 55, 55, 999, 3};
        Integer [] expected = new Integer[]{3, 7, 55, 55, 60, 999};

        Integer [] sorted = timSort.sort(array);

        assertArrayEquals(expected, sorted);
    }

    @Test
    void shouldAcceptWhenStringValueArrayIsPassed() {
        String[] array = {"z", "a", "x", "b", "y"};
        String[] expected = {"a", "b", "x", "y", "z"};

        String[] sorted = timSort.sort(array);

        assertArrayEquals(expected, sorted);
    }

    @Test
    void shouldAcceptWhenRandomArrayIsPassed() {
        int randomSize = SortUtilsRandomGenerator.generateInt(10_000);
        Double[] array = SortUtilsRandomGenerator.generateArray(randomSize);
        Double[] sorted = timSort.sort(array);
        assertTrue(SortUtils.isSorted(sorted));
    }

}