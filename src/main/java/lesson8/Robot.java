package lesson8;

public class Robot implements Running, Jumping {
    private String name;
    private int maxLength = 100000;
    private double maxHeight = 3;
    private boolean success;

    public Robot(String name) {
        this.name = name;
    }

    public void run(Treadmill l) {
        success = l.operate(maxLength);
        if (success == true) {
            System.out.println(name + " пробежал дистанцию в " + l.getLength() + " м.");
        } else {
            System.out.println(name + " не смог пробежать дистанцию в " + l.getLength() + " м.");
        }
    }

    public void jump(Wall h) {
        success = h.operate(maxHeight);
        if (success == true) {
            System.out.println(name + " перепрыгнул препятствие высотой в " + h.getHeight() + " м.");
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие высотой в " + h.getHeight() + " м.");
        }
    }
}
