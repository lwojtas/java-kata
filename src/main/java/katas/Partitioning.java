package katas;

import helpers.Person;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Partition adults and kids
 */
public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults(Collection<Person> people) {
        return people.stream().collect(Collectors.partitioningBy(p -> p.getAge() > 18));
    }
}
