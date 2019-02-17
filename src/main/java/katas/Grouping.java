package katas;


import helpers.Person;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    public static Map<String, List<Person>> groupByNationality(Collection<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getNationality));
    }
}
