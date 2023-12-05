package edu.pvr.programs;

import edu.pvr.programs.remove_duplicates.RemoveDuplicatesFromListCaseInSensitive;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromListCaseInSensitiveTest {


    private final List<String> values = List.of("Java", "java", "Go", "Python", "GO");
    private final List<String> expected = List.of("java", "go", "python");

    private static RemoveDuplicatesFromListCaseInSensitive removeDuplicatesFromList;

    @BeforeAll
    public static void beforeAll() {
        removeDuplicatesFromList = new RemoveDuplicatesFromListCaseInSensitive();
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
    void testRemoveDuplicatesUsingPrimitiveFor() {
        assertEquals(expected, removeDuplicatesFromList.removeDuplicatesUsingPrimitiveFor(values));
    }

    @Test
    void testRemoveDuplicatesUsingSetAndFor() {
        assertEquals(expected, removeDuplicatesFromList.removeDuplicatesUsingSetAndFor(values));
    }
}