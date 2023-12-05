package edu.pvr.programs;

import edu.pvr.programs.remove_duplicates.RemoveDuplicatesFromList;
import edu.pvr.programs.remove_duplicates.dto.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromListTest {

    private final List<String> values = List.of("Java", "Java", "Go", "Python", "Go");
    private final List<String> expected = List.of("Java", "Go", "Python");

    private final List<Person> persons = List.of(
            new Person("pranav", "kochi"),
            new Person("PRANAV", "KOCHI")
    );
    private final List<Person> expectedPersons = List.of(
            new Person("pranav", "kochi")
    );


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

    //    PERSONS
    @Test
    void testRemoveDuplicatesUsingStreamsDistinctForPersons() {
        assertEquals(expectedPersons, removeDuplicatesFromList.removeDuplicatesUsingStreamsDistinct(persons));
    }
}