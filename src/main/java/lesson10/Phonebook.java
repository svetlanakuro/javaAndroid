package lesson10;

import java.util.*;

public class Phonebook {
    private final HashMap <String, Set<String>> book = new HashMap<>();

    public void add(String surname, String telephone) {
        Set<String> phones;
        if (book.containsKey(surname)) {
            phones = book.get(surname);
            phones.add(telephone);
        } else {
            phones = new HashSet<>();
            phones.add(telephone);
            book.put(surname, phones);
        }
    }

    public void get(String surname) {
        Set<String> phones = book.get(surname);
        System.out.println("Все номера пользователя " + surname + " : " + phones);
    }
}
