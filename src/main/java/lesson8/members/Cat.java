package lesson8.members;

import lesson8.barriers.Treadmill;
import lesson8.barriers.Wall;
import lesson8.interfaces.Members;

public class Cat implements Members {
    private String name;
    private int maxLength = 500;
    private double maxHeight = 2;
    private boolean success;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(Treadmill l) {
        success = l.operate(maxLength);
        if (success == true) {
            System.out.println(name + " пробежал дистанцию в " + l.getLength() + " м.");
            return true;
        } else {
            System.out.println(name + " не смог пробежать дистанцию в " + l.getLength() + " м.");
            return false;
        }
    }

    @Override
    public boolean jump(Wall h) {
        success = h.operate(maxHeight);
        if (success == true) {
            System.out.println(name + " перепрыгнул препятствие высотой в " + h.getHeight() + " м.");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие высотой в " + h.getHeight() + " м.");
            return false;
        }
    }
}
