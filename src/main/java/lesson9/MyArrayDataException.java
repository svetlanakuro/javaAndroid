package lesson9;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super("Некорректные данные в массиве. Элемент с индексом: [" + i + "][" + j + "].");
    }
}
