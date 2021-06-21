package lesson10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {"apple","banana","grapefruit","kiwi","lemon",
                "blackberry","cherry","currant","grape","strawberry",
                "grapefruit","grape","lemon","cherry","apple",
                "persimmon","pomegranate","gooseberry","watermelon","lemon"};

        HashSet<String> wordsSet = new HashSet<>(Arrays.asList(wordsArray));
//        for (String word : wordsArray) {
//            wordsSet.add(word);
//        }

        System.out.println(wordsSet);

        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String words : wordsArray) {
            if (wordsMap.containsKey(words)) {
                wordsMap.put(words, wordsMap.get(words) + 1);
            } else {
                wordsMap.put(words, 1);
            }
        }
        System.out.println(wordsMap.keySet());
        System.out.println(wordsMap);
        System.out.println();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov","+79876543210");
        phonebook.add("Petrov","+79876543211");
        phonebook.add("Petrov","+79876543212");
        phonebook.add("Petrov","+79876543213");
        phonebook.add("Ivanov","+79876543214");

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
    }
}
