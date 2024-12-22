package com.akki;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPersonWithIterator {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person(1, "Fatima"));
        people.add(new Person(2, "Majda"));
        people.add(new Person(3, "Ahlam"));

        // Suppression avec iterator (sécurisé)
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().equals("Majda")) {
                iterator.remove(); // Suppression sécurisée
            }
        }

        System.out.println("Set après suppression de 'Majda' : " + people);
    }
}
