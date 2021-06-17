package lesson10;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {"apple","banana","grapefruit","kiwi","lemon",
                "blackberry","cherry","currant","grape","strawberry",
                "grapefruit","grape","lemon","cherry","apple",
                "persimmon","pomegranate","gooseberry","watermelon","lemon"};

        HashSet<String> wordsSet = new HashSet<>();
        for (String word : wordsArray) {
            wordsSet.add(word);
        }
        for (String words : wordsSet) {
            System.out.println(words + " ");
        }
        System.out.println();

        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String words : wordsArray) {
            if (wordsMap.keySet().contains(words)) {
                wordsMap.put(words, wordsMap.get(words) + 1);
            } else {
                wordsMap.put(words, 1);
            }
        }
        System.out.println(wordsMap);
        System.out.println();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov","+79876543221");
        phonebook.add("Petrov","+79876543212");
        phonebook.add("Petrov","+79876543232");

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
    }
}
