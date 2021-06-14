package lesson9;

public class MyArrayDataException extends Exception {
    protected int i;
    protected int j;

    public MyArrayDataException(int i, int j) {
        super("Некорректные данные в массиве. Элемент с индексом: [" + i + "][" + j + "].");
        this.i = i;
        this.j = j;
    }
}
