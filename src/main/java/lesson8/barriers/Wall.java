package lesson8.barriers;

import lesson8.interfaces.Barrier;

import java.util.Random;

public class Wall implements Barrier {
    private double height;

    public Wall() {
        Random random = new Random();
        height = 1.0 + random.nextInt(20)/10.0;
    }

    public double getHeight() {
        return height;
    }

    public boolean operate(double h) {
        if (height <= h) {
            return true;
        } else {
            return false;
        }
    }
}
