package katas;

import helpers.Person;

import java.util.Collection;
import java.util.stream.Collectors;

/*
 * Return people names separated by comma
 */
public class Joining {

    public static String namesToString(Collection<Person> people) {
        return people.stream().map(Person::getName).collect(Collectors.joining(", ", "Names: ", "."));
    }

}
