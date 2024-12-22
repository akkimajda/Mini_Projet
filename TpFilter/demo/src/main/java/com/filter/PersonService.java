package com.filter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonService {
    public static List<Person> filterByAddress(String address) {
        List<Person> mockPersonsDatabase = Arrays.asList(
            new Person("Fatima", "Ayoubi", LocalDate.of(2002, 11, 2), "Rabat"),
            new Person("Majda", "Aakki", LocalDate.of(2003, 04, 12), "Casablanca"),
            new Person("Ahlam", "Lilane", LocalDate.of(2003, 02, 11), "Marrakech")
        );

        Predicate<Person> hasAddress = person -> person.getAddress().equals(address);

        return mockPersonsDatabase.stream()
                                  .filter(hasAddress)
                                  .collect(Collectors.toList());
    }

    public static List<Person> filterAdults() {
        List<Person> mockPersonsDatabase = Arrays.asList(
            new Person("Fatima", "Ayoubi", LocalDate.of(2002, 11, 2), "Rabat"),
            new Person("Majda", "Aakki", LocalDate.of(2003, 04, 12), "Casablanca"),
            new Person("Ahlam", "Lilane", LocalDate.of(2003, 02, 11), "Marrakech")
        );

        Predicate<Person> isAdult = person -> person.calculateAge() >= 18;

        return mockPersonsDatabase.stream()
                                  .filter(isAdult)
                                  .collect(Collectors.toList());
    }
}
