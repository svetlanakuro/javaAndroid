package lesson14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        try {
            System.out.println(Arrays.toString(operation.changeArray(arr)));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println();

        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            if (i < arr1.length / 2) {
                arr1[i] = 1;
            } else {
                arr1[i] = 4;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(operation.checkArray(arr1));
    }
}
