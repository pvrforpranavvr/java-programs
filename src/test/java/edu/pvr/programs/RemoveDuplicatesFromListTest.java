package edu.pvr.programs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromListTest {

    private final List<String> values = List.of("Java", "Java", "Go", "Python", "Go");
    private final List<String> expected = List.of("Java", "Go", "Python");

    private static RemoveDuplicatesFromList removeDuplicatesFromList;

    @BeforeAll
    public static void beforeAll() {
        removeDuplicatesFromList = new RemoveDuplicatesFromList();
    }

    @Test
    void testRemoveDuplicatesUsingStreamsDistinct() {
        assertEquals(expected, removeDuplicatesFromList.removeDuplicatesUsingStreamsDistinct(values));
    }

    @Test
    void testRemoveDuplicatesUsingStreamsFilter() {
        assertEquals(expected, removeDuplicatesFromList.removeDuplicatesUsingStreamsFilter(values));
    }

    @Test
    void testRemoveDuplicatesUsingSet() {
        assertEquals(expected, removeDuplicatesFromList.removeDuplicatesUsingSet(values));
    }

    @Test
    void testRemoveDuplicatesUsingPrimitiveFor() {
        assertEquals(expected, removeDuplicatesFromList.removeDuplicatesUsingPrimitiveFor(values));
    }

    @Test
    void testRemoveDuplicatesUsingSetAndFor() {
        assertEquals(expected, removeDuplicatesFromList.removeDuplicatesUsingSetAndFor(values));
    }
}