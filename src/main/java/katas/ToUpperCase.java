package katas;

import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

    /*
     * Convert elements of a collection to upper case.
     */
    public static List<String> transform(List<String> collection) {
        return collection.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

}
