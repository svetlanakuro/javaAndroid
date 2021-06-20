package lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] arr2 = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        String[][] arr3 = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"s", "14", "15", "16"}
        };

        try {
            convertArray(arr1);
//            convertArray(arr2);
            convertArray(arr3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    private static void convertArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Некорректный размер массива. Задайте массив размером 4х4.");
        }

        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Некорректный размер массива. Задайте массив размером 4х4.");
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        System.out.println(sum);
    }
}
