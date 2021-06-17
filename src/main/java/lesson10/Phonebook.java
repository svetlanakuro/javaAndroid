package lesson10;

import java.util.*;

public class Phonebook {
    private HashMap <String, List<String>> book = new HashMap<>();

    public void add(String surname, String telephone) {
        if (book.keySet().contains(surname)) {
            List<String> phone = book.get(surname);
            for (String p : phone) {
                book.put(surname, Arrays.asList(p, telephone));
            }
        } else {
            book.put(surname, Collections.singletonList(telephone));
        }
    }

    public void get(String surname) {
        List<String> phone = book.get(surname);
        System.out.println(phone);
    }
}
