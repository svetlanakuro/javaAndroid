package lesson7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[6];
        for (int i = 0; i < cats.length; i++) {
            Random random = new Random();
            cats[i] = new Cat("Cat"+i, random.nextInt(10));
        }

        Plate plate1 = new Plate(10);
        plate1.info();
        System.out.println();

        for (Cat cat : cats) {
            cat.eat(plate1);
            System.out.println();
        }

        plate1.info();
        System.out.println();

        plate1.filling(20);
        plate1.info();
    }
}
