package katas;

import helpers.Person;

import java.util.IntSummaryStatistics;
import java.util.List;

/*
 * Get people statistics: average age, count, maximum age, minimum age and sum og all ages.
 */
public class PeopleStats {

    public static IntSummaryStatistics getStats(List<Person> people) {
        return people.stream().mapToInt(Person::getAge).summaryStatistics();
    }

}
