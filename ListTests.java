import static org.junit.Assert.*;

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

    @Test
    public void testMergeUnique() {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "e", "f");
        List<String> expected = Arrays.asList("a", "b", "c", "d", "e", "f");
        assertEquals(expected, ListExamples.merge(list1, list2));
    }

    @Test
    public void testMergeEmptyLists() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, ListExamples.merge(list1, list2));
    }
}
