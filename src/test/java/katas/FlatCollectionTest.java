package katas;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static katas.FlatCollection.transform;

public class FlatCollectionTest {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Victor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Victor", "Farcic", "John", "Doe", "Third");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

}
