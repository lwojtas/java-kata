package katas;

import helpers.Person;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static katas.Partitioning.partitionAdults;
import static org.assertj.core.api.Assertions.assertThat;


public class PartitioningTest {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4);
        Person victor = new Person("Victor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, victor);
        Map<Boolean, List<Person>> result = partitionAdults(collection);
        assertThat(result.get(true)).hasSameElementsAs(asList(victor, eva));
        assertThat(result.get(false)).hasSameElementsAs(asList(sara));
    }

}
