package lesson8.barriers;

import lesson8.interfaces.Barrier;

import java.util.Random;

public class Treadmill implements Barrier {
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
