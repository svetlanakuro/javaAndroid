package lesson12;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_001;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {

        float[] arr1 = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr1[i] = 1.00f;
        }

        float[] arr2 = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr2[i] = 1.00f;
        }

        compute1(arr1);
        compute2(arr2);
    }

    static void compute1(float[] arr) {
        long a = System.currentTimeMillis();
        compute(arr, 0);
        System.out.println(System.currentTimeMillis() - a);
//        System.out.println(Arrays.toString(arr));
    }

    static void compute(float[] arr, int offset) {
        for (int i = 0; i < arr.length; i++) {
            int j = i + offset;
            arr[i] = (float)(arr[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }
    }

    static void compute2(float[] arr) {
        long a = System.currentTimeMillis();
        float[] a1 = new float[HALF];
        float[] a2 = new float[arr.length - a1.length];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, (arr.length - a1.length));
        compute(a1,0);

        Thread threadExample = new Thread(() -> {
            compute(a2, HALF);
        });
        threadExample.start();

        try {
            threadExample.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, a2.length);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
//        System.out.println(Arrays.toString(arr));
    }
}
