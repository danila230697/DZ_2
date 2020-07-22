package lesson_three.home;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

    private final HashMap<String, ArrayList<Person>> entries = new HashMap<>();

    public void add(String surname, String phone, String mail) {
        if (entries.containsKey(surname)) {
            ArrayList<Person> persons = entries.get(surname);
            persons.add(new Person(phone, mail));
        } else {
            ArrayList<Person> persons = new ArrayList<>();
            persons.add(new Person(phone, mail));
            entries.put(surname, persons);
        }
    }

    public ArrayList<String> getMails(String name) {
        if (!entries.containsKey(name)) return null;
        ArrayList<Person> persons = entries.get(name);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            result.add(persons.get(i).email);
        }
        return result;
    }

    public ArrayList<String> getPhones(String name) {
        if (!entries.containsKey(name)) return null;
        ArrayList<Person> persons = entries.get(name);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            result.add(persons.get(i).phone);
        }
        return result;
    }
}
