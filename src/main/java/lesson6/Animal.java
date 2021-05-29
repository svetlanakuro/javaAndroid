package lesson6;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void run(int length);
    public abstract boolean jump(double height);
    public abstract void swim(int length);
}
