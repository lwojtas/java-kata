package katas;

import helpers.Person;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static katas.OldestPerson.getOldestPerson;

public class OldestPersonTest {

    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person victor = new Person("Victor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, victor);
        assertThat(getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
    }

}
