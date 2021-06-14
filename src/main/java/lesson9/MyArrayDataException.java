package lesson9;

public class MyArrayDataException extends Exception {
    protected int i;
    protected int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }
}
