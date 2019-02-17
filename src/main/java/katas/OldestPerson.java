package katas;

import helpers.Person;

import java.util.Collection;
import java.util.Comparator;

public class OldestPerson {

    /*
     * Get oldest person from the collection
     */
    public static Person getOldestPerson(Collection<Person> people) {
        return people.stream().max(Comparator.comparingInt(Person::getAge)).get();
    }

}
