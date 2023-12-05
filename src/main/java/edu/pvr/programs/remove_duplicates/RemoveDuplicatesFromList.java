package edu.pvr.programs.remove_duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList<E> {

    public List<E> removeDuplicatesUsingStreamsDistinct(List<E> values) {
        return values.stream()
                .distinct()
                .collect(Collectors.toList());

    }

    public List<E> removeDuplicatesUsingStreamsFilter(List<E> values) {
        Set<E> unique = new HashSet<>();
        return values.stream()
                .filter(unique::add)
                .collect(Collectors.toList());

    }

    public List<E> removeDuplicatesUsingSet(List<E> values) {
        Set<E> unique = new HashSet<>(values);
        return new ArrayList<>(unique);
    }

    public List<E> removeDuplicatesUsingPrimitiveFor(List<E> values) {

        List<E> deduplicatedList = new ArrayList<>();
        for (E value : values) {
            boolean found = false;
            for (E s : deduplicatedList) {
                if (value.equals(s)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                deduplicatedList.add(value);
            }
        }
        return deduplicatedList;
    }

    public List<E> removeDuplicatesUsingSetAndFor(List<E> values) {
        Set<E> uniqueSet = new HashSet<>();
        List<E> deduplicatedList = new ArrayList<>();

        for (E value : values) {
            if (uniqueSet.add(value)) {
                deduplicatedList.add(value);
            }
        }
        return deduplicatedList;
    }
}
