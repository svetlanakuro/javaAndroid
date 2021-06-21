package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {"apple","banana","grapefruit","kiwi","lemon"};
        Integer[] numbersArray = {12,34,56,78,90};

        // преобразует массив в ArrayList
        ArrayList<?> wordsList = convertArray(wordsArray);
        ArrayList<?> numbersList = convertArray(numbersArray);
        System.out.println(wordsList + "\n" + numbersList);

        System.out.println();

        // меняет два элемента массива местами
        changeArray(wordsArray, 1, 4);
        System.out.println(Arrays.toString(wordsArray));

        changeArray(numbersArray, 1, 4);
        System.out.println(Arrays.toString(numbersArray));

        System.out.println();

        // классы Fruit, Apple extends Fruit, Orange extends Fruit
        Apple apple = new Apple();
        Orange orange = new Orange();
        // класс Box, в который можно складывать фрукты, по типу фрукта
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.add(apple);
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.remove(apple);
        appleBox2.add(new Apple());
        orangeBox.add(orange);
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        appleBox.info();
        appleBox2.info();
        orangeBox.info();
        System.out.println();

        // метод позволяет сравнить текущую коробку с той, которую подадут в compare()
        System.out.println("Сравнить вес коробки с яблоками и коробки с апельсинами: " + appleBox.compare(orangeBox));
        System.out.println("Сравнить вес коробки с яблоками2 и коробки с апельсинами: " + appleBox2.compare(orangeBox));
        System.out.println();

        // метод позволяет пересыпать фрукты из текущей коробки в другую, по типу фрукта
        appleBox2.move(appleBox);
        appleBox2.info();
        appleBox.info();
    }

    private static <A> void changeArray(A[] arr, int i1, int i2) {
        A change = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = change;
    }

    private static <A> ArrayList<A> convertArray(A[] arr) {
        ArrayList<A> arrayList = new ArrayList<>();
        for (A a : arr) {
            arrayList.add(a);
        }
        return arrayList;
    }
}
