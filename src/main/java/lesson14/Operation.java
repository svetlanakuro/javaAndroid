package lesson14;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Operation {
    public int[] changeArray(int arr[]) {
        int newArray[] = ArrayUtils.subarray(arr,
                ArrayUtils.lastIndexOf(arr, 4) + 1,
                ArrayUtils.getLength(arr)+1);
        if (Arrays.equals(arr, newArray)) throw new RuntimeException("В массиве отсутствует число = 4.");
        return newArray;
    }

    public boolean checkArray(int arr[]) {
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
                check &= (arr[i] == 1 || arr[i] == 4);
        }
        check &= (ArrayUtils.contains(arr, 1) && ArrayUtils.contains(arr, 4));
        return check;
    }
}
