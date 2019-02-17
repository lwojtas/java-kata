package katas;

import helpers.Person;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class Kid {

    /*
     * Get names of all kids (under age of 18)
     */
    public static Set<String> getKidNames(Collection<Person> people) {
        return people.stream().filter(p -> p.getAge() < 18).map(Person::getName).collect(Collectors.toSet());
    }

}
