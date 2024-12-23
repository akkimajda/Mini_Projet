package com.filter;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import com.filter.PersonService;
import com.filter.Person;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class PersonServiceTest {

    @Test
    public void testFilterByAddress() {
        List<Person> peopleLivingIn123RueA = PersonService.filterByAddress("123 Rue A");

        List<Person> expectedPersonsLivingIn123RueA = Arrays.asList(
                new Person("hiba", "mkammar", LocalDate.of(1990, 5, 12), "123 Rue A"),
                new Person("ayoubi", "fatima", LocalDate.of(1985, 3, 9), "123 Rue A")
        );

        assertThat(peopleLivingIn123RueA).hasSize(2);
        assertThat(peopleLivingIn123RueA).containsExactlyInAnyOrderElementsOf(expectedPersonsLivingIn123RueA);
    }

    @Test
    public void testFilterAdults() {
        List<Person> adults = PersonService.filterAdults();


        List<Person> expectedAdultPersons = Arrays.asList(
                new Person("hiba", "mkammar", LocalDate.of(1990, 5, 12), "123 Rue A"),
                new Person("ayoubi", "fatima", LocalDate.of(1985, 3, 9), "789 Rue C")

        );

        assertThat(adults).containsExactlyInAnyOrderElementsOf(expectedAdultPersons);
    }
}