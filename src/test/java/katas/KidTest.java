package katas;

import helpers.Person;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static katas.Kid.getKidNames;

public class KidTest {

    @Test
    public void getKidNameShouldReturnNamesOfAllKidsFromNorway() {
        Person sara = new Person("Sara", 4);
        Person victor = new Person("Victor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, victor, anna);
        assertThat(getKidNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Victor", "Eva");
    }

}
