import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilterWithPassString() {
        List<String> input = Arrays.asList("apple", "banana", "cherry");
        StringChecker checker = s -> s.contains("a");
        List<String> expected = Arrays.asList("apple", "banana");
        assertEquals(expected, ListExamples.filter(input, checker));
    }

    @Test
    public void testFilterWithDontPassString() {
        List<String> input = Arrays.asList("apple", "banana", "cherry");
        StringChecker checker = s -> s.contains("w");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ListExamples.filter(input, checker));
    }

    @Test
    public void testFilterEmptyList() {
        List<String> input = new ArrayList<>();
        StringChecker checker = s -> s.contains("a");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ListExamples.filter(input, checker));
    }

}
