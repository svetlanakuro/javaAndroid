package lesson12;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1.00f;
        }

        compute1(arr);
        compute2(arr);
    }

    static void compute1(float[] arr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
//        System.out.println(Arrays.toString(arr));
    }

    static void compute2(float[] arr) {
        long a = System.currentTimeMillis();
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
        MyThreadExample threadExample1 = new MyThreadExample(HALF, a1);
        MyThreadExample threadExample2 = new MyThreadExample(HALF, a2);
        threadExample1.start();
        threadExample2.start();
        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
//        System.out.println(Arrays.toString(arr));
    }
}
