package testSelectionSort;

import org.junit.jupiter.api.Test;

import benjaminRichardsLab10.SelectionSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class testSelectionSort {

    @Test public void testPositives() {
        SelectionSort selectionSort = new SelectionSort();

        // Test case: Sorting an array of positive integers
        int[] unsortedArray = {5, 2, 8, 1, 6};
        int[] sortedArray = {1, 2, 5, 6, 8};

        int[] result = selectionSort.basicSelectionSort(unsortedArray);

        // Assert that the result matches the expected sorted array
        assertArrayEquals(sortedArray, result);
    }
    
    @Test public void testNegatives() {
        SelectionSort selectionSort = new SelectionSort();
        // Test case: Sorting an array of negative integers
        int[] unsortedArray = {-5, -2, -8, -1, -6};	
        int[] sortedArray = {-8, -6, -5, -2, -1};

        int[] result = selectionSort.basicSelectionSort(unsortedArray);

        // Assert that the result matches the expected sorted array
        assertArrayEquals(sortedArray, result);
    }
    
    @Test public void testMixed() {
        SelectionSort selectionSort = new SelectionSort();

        // Test case: Sorting an array with positive, negative, and zero integers
        int[] unsortedArray = {5, -2, 0, -1, 6};
        int[] sortedArray = {-2, -1, 0, 5, 6};

        int[] result = selectionSort.basicSelectionSort(unsortedArray);

        // Assert that the result matches the expected sorted array
        assertArrayEquals(sortedArray, result);
    }
    
    @Test public void testDuplicates() {
        SelectionSort selectionSort = new SelectionSort();

        // Test case: Sorting an array with duplicate numbers (positive and negative)
        int[] unsortedArray = {5, -2, 3, -2, 6, 3};
        int[] sortedArray = {-2, -2, 3, 3, 5, 6};

        int[] result = selectionSort.basicSelectionSort(unsortedArray);

        // Assert that the result matches the expected sorted array
        assertArrayEquals(sortedArray, result);
    }
    
}