import com.tri.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class TriTest {

    @Test
    void TriPersonsWithLastNameAndFirstName() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("aakki", "majda"));
        people.add(new Person("ayoubi", "fatima"));
        people.add(new Person("lilane", "ahlam"));

        Collections.sort(people);
        assertThat(people).isNotNull();
        //assertJ
        assertThat(people)
                .extracting(Person::toString)
                .containsExactly(
                        "aakki, majda",
                        "ayoubi, fatima",
                        "lilane, ahlam"

                );
    }
}