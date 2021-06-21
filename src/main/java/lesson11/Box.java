package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Box() {
        list = new ArrayList<T>();
    }

    public void add(T obj) {
        list.add(obj);
    }

    public void remove(T obj) {
        list.remove(obj);
    }

    public float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста.");
        } else {
            System.out.println("Коробка, в которой хранятся " + list.get(0).toString() + " в количестве " + list.size() + "шт, весит: " + list.size() * list.get(0).getWeight());
        }
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void move(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

}
