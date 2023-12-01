package benjaminRichardsLab10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testPositives() {
        SelectionSort selectionSort = new SelectionSort();

        // Test case: Sorting an array of positive integers
        int[] unsortedArray = {5, 2, 8, 1, 6};
        int[] sortedArray = {1, 2, 5, 6, 8};

        int[] result = selectionSort.basicSelectionSort(unsortedArray);

        // Assert that the result matches the expected sorted array
        assertArrayEquals(sortedArray, result);
    }
}
