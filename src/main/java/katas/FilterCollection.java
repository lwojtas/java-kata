package katas;

import java.util.Collection;
import java.util.stream.Collectors;

public class FilterCollection {

    /*
     * Filter collection so that only elements with less then 4 characters are returned.
     */
    public static Collection<String> transform(Collection<String> collection) {
        return collection.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }

}
