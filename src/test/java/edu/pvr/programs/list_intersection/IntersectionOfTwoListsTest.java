package edu.pvr.programs.list_intersection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionOfTwoListsTest {

    private static IntersectionOfTwoLists intersectionOfTwoLists;
    private List<String> leftItems = Arrays.asList("apple", "banana", "orange", "grape");
    private List<String> rightItems = Arrays.asList("orange", "grape", "kiwi", "pear");
    List<String> expectedIntersection = Arrays.asList("orange", "grape");

    @BeforeAll
    public static void beforeAll() {
        intersectionOfTwoLists = new IntersectionOfTwoLists();
    }

    @Test
    public void testIntersectionUsingPrimitive() {

        List<String> intersection = intersectionOfTwoLists.intersectionUsingPrimitive(leftItems, rightItems);
        assertEquals(expectedIntersection, intersection);
    }

    @Test
    public void testIntersectionUsingStreams() {

        List<String> intersection = intersectionOfTwoLists.intersectionUsingStreams(leftItems, rightItems);
        assertEquals(expectedIntersection, intersection);
    }

    @Test
    public void testIntersectionUsingStreamsAndContains() {

        List<String> intersection = intersectionOfTwoLists.intersectionUsingStreamsAndContains(leftItems, rightItems);
        assertEquals(expectedIntersection, intersection);
    }
}