package lesson6;

public class Cat extends Animal {
    private String breed;
    private int maxLength = 200;
    private double maxHeight = 2;
    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void run(int length) {
        if (length <= maxLength) {
            System.out.println(name + " (" + breed + ") пробежал " + length + " метров.");
        } else {
            System.out.println(name + " (" + breed + ") не хочет бежать " + length + " метров и лениво лежит.");
        }
    }

    @Override
    public boolean jump(double height) {
        if (breed == "манчкин") {
            maxHeight = 1;
        }
        if (breed == "мейн-кун") {
            maxHeight = 2.5;
        }
        if (height <= maxHeight) {
            return true;
        }
        return false;
    }

    @Override
    public void swim(int length) {
        System.out.println(name + " не умеет плавать.");
    }
}
