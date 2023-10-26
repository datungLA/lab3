import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlaceWithOneElement() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceWithMoreElements() {
    int[] input1 = { 1, 2, 3, 4, 5, 6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 6, 5, 4, 3, 2, 1 }, input1);
  }

  @Test
  public void testReversedWithElements() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[] { 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseArrAddress() {
    int[] input1 = { 1, 2, 3 };
    assertNotSame(input1, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 1, 2, 2, 5 };
    double temp = ArrayExamples.averageWithoutLowest(input1);
    assertEquals("3.0", Double.toString(temp));
  }
}
