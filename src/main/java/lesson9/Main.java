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
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Некорректные данные в массиве. Элемент в ячейке: [" + (e.i+1) + "][" + (e.j+1) + "].");
            e.printStackTrace();
        }

    }

    private static void convertArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int convert;
        int result = 0;
        int maxLine = arr.length;
        int maxColumn = arr[0].length;

        if (maxLine != 4 || maxColumn != 4) {
            throw new MyArraySizeException("Некорректный размер массива. Задайте массив размером 4х4.");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    convert = Integer.parseInt(arr[i][j]);
                    result = result + convert;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(result);
    }
}
