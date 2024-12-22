package com.akki;

import java.util.HashSet;
import java.util.Set;

public class TestPersonWithoutIterator {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "Fatima"));
        people.add(new Person(2, "Majda"));
        people.add(new Person(3, "Ahlam"));

        // Suppression sans iterator (provoque une ConcurrentModificationException)
        for (Person person : people) {
            if (person.getName().equals("Majda")) {
                people.remove(person); // Erreur ici
            }
        }
    }
}
