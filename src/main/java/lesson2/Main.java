package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        createArrayBinary();
        System.out.println();
        createArray();
        System.out.println();
        changeArray();
        System.out.println();
        createArraySquareBinary();
        System.out.println();
        searchArrayMinMax();
        System.out.println();
        searchArrayMinMax();
        System.out.println();

        int arr[] = { 2 , 1 , 3 , 1 , 4 , 1 };
        System.out.println(compareArrayDelimiter(arr));
        System.out.println();

        int step = -3;
        displacedArray(arr, step);
    }

    private static void createArrayBinary() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 2);
        }
        System.out.println("Создан массив:\n" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        System.out.println("Массив инвертирован:\n" + Arrays.toString(arr));
    }

    private static void createArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println("Создан массив с шагом 3:\n" + Arrays.toString(arr));
    }

    private static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("Изменённый массив (все числа меньше 6 умножены на 2):\n" + Arrays.toString(arr));
    }

    private static void createArraySquareBinary() {
        int[][] arr = new int[4][4];
        System.out.print("Квадратный двумерный массив, диагонали которого изменены на 1:\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if ((arr.length - 1 - i) == j) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static void searchArrayMinMax() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Создан массив случайных чисел до 100:\n" + Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
            if ((arr[i] >= max)) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное число в массиве = " + min + "\nМаксимальное число в массиве = " + max);
    }

    public static boolean compareArrayDelimiter(int[] arr) {
        int delimiter = 1;
        while (true) {
            if (sumDelimiter(arr, delimiter)) {
                writeArrayDelimiter(arr, delimiter);
                return true;
            }
            delimiter++;
            if (delimiter == arr.length) {
                writeArrayDelimiter(arr);
                return false;
            }
        }
    }

    public static boolean sumDelimiter(int[] arr, int delimiter) {
        int l = 0;
        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            if (delimiter < i) {
                l = l + arr[i];
            } else {
                r = r + arr[i];
            }
        }
        if (l == r) {
            return true;
        } else {
            return false;
        }
    }

    public static void writeArrayDelimiter(int[] arr, int delimiter) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (delimiter == i) {
                System.out.print("||");
            }
        }
        System.out.print("]");
    }

    public static void writeArrayDelimiter(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }

    private static void displacedArray(int[] arr, int step) {
        System.out.println(Arrays.toString(arr));
        if (step > 0) {
            while (step > 0) {
                arr = stepDisplacedRight(arr);
                step--;
            }
        } else {
            while (step < 0) {
                arr = stepDisplacedLeft(arr);
                step++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] stepDisplacedRight(int [] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }
    private static int[] stepDisplacedLeft(int [] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
