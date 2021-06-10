package lesson8;

import java.util.Random;

public class Treadmill {
    private int length;

    public Treadmill() {
        Random random = new Random();
        length = random.nextInt(5000);
    }

    public int getLength() {
        return length;
    }

    public boolean operate(int l) {
        if (length <= l) {
            return true;
        } else {
            return false;
        }
    }
}
