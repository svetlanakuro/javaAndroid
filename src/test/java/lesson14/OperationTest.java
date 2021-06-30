package lesson14;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class OperationTest {

    @Test
    public void changeArray() {
        Operation operation = new Operation();

        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals("[5, 6, 7, 8, 9]", Arrays.toString(operation.changeArray(arr1)));

        int[] arr2 = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        Assertions.assertEquals("[]", Arrays.toString(operation.changeArray(arr2)));
    }

    @Test
    public void exceptionTesting() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> { throw new IllegalArgumentException("В массиве отсутствует число = 4."); }
        );

        assertEquals("В массиве отсутствует число = 4.", exception.getMessage());
    }

    @Test
    public void checkArray() {
        Operation operation = new Operation();

        int[] arr1 = {1, 1, 1, 1, 1, 4, 4, 4, 4, 4};
        Assertions.assertTrue(operation.checkArray(arr1));

        int[] arr2 = {1, 4, 1, 4, 1, 4, 1, 4, 1, 4};
        Assertions.assertTrue(operation.checkArray(arr2));

        int[] arr3 = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        Assertions.assertFalse(operation.checkArray(arr3));

        int[] arr4 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Assertions.assertFalse(operation.checkArray(arr4));

        int[] arr5 = {0, 2, 3, 5, 6, 7, 8, 9, 0, 2};
        Assertions.assertFalse(operation.checkArray(arr5));
    }
}