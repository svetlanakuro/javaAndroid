package lesson12;

public class MyThreadExample extends Thread {
    private final int SIZE;
    private float[] arr;

    public MyThreadExample(int SIZE, float[] arr) {
        this.SIZE = SIZE;
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
