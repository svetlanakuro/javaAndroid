package lesson10;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private String surname;
    private String telephone;
    private HashMap <String, List<String>> book = new HashMap<>();

    public HashMap<String, List<String>> getBook() {
        return book;
    }

    public void setBook(HashMap<String, List<String>> book) {
        this.book = book;
    }

    public void add(String surname, String telephone) {
        if (book.keySet().contains(surname)) {
            book.put(surname, Arrays.asList(telephone, telephone));
        } else {
            book.put(surname, Collections.singletonList(telephone));
        }
    }

    public void get(String surname) {
        List<String> phone = book.get(surname);
        System.out.println(phone);
    }
}
