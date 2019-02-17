package katas;

import java.util.Collection;

public class Sum {

    /*
     * Sum all elements of a collection
     */
    public static int calculate(Collection<Integer> numbers) {
        return numbers.stream().reduce(0, (i1, i2) -> i1 + i2);
    }
}
