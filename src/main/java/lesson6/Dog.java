package lesson6;

public class Dog extends Animal {
    private String breed;
    private int maxLength = 500;
    private double maxHeight = 0.5;
    private int maxLengthSwim = 10;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void run(int length) {
        if (breed == "такса") {
            maxLength = 400;
        }
        if (breed == "маламут") {
            maxLength = 600;
        }
        if (length <= maxLength) {
            System.out.println(name + " (" + breed + ") пробежал " + length + " метров.");
        } else {
            System.out.println(name + " (" + breed + ") не хочет бежать " + length + " метров и машет хвостом.");
        }
    }

    @Override
    public boolean jump(double height) {
        if (breed == "маламут") {
            maxHeight = 1.5;
        }
        if (height <= maxHeight) {
            return true;
        }
        return false;
    }

    @Override
    public void swim(int length) {
        if (length <= maxLengthSwim) {
            System.out.println(name + " проплыл " + length + " метров.");
        } else {
            System.out.println(name + " не хочет плыть " + length + " метров, потому что знает, что утонет.");
        }
    }
}
