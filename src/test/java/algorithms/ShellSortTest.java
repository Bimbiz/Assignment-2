package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShellSortTest {
    @Test
    void testEmptyArray() {
        int[] arr = {};
        new ShellSort().sort(arr, "knuth");
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testRandomArray() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        new ShellSort().sort(arr, "knuth");
        assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, arr);
    }
}
