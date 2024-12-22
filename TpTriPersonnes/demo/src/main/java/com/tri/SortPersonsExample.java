package com.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPersonsExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ayoubi", "Fatima"));
        people.add(new Person("mkammer", "Hiba"));
        people.add(new Person("Aakki", "Majda"));
        people.add(new Person("Lilane", "Ahlam"));

        // Tri de la liste de personnes
        Collections.sort(people);

        // Affichage des personnes triées
        System.out.println("Liste triée de personnes : ");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
