package katas;

import helpers.Person;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static katas.Joining.namesToString;
import static org.assertj.core.api.Assertions.assertThat;

public class JoiningTest {

    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = new Person("Sara", 4);
        Person victor = new Person("Victor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, victor, eva);
        assertThat(namesToString(collection))
                .isEqualTo("Names: Sara, Victor, Eva.");
    }

}
