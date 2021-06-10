package lesson8;

public class Human implements Running, Jumping {
    private String name;
    private int maxLength = 1000;
    private double maxHeight = 1.5;
    private boolean success;

    public Human(String name) {
        this.name = name;
        this.success = true;
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
