package edu.pvr.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public List<String> removeDuplicatesUsingStreamsDistinct(List<String> values) {
        return values.stream()
                .distinct()
                .collect(Collectors.toList());

    }

    public List<String> removeDuplicatesUsingStreamsFilter(List<String> values) {
        Set<String> unique = new HashSet<>();
        return values.stream()
                .filter(unique::add)
                .collect(Collectors.toList());

    }

    public List<String> removeDuplicatesUsingSet(List<String> values) {
        Set<String> unique = new HashSet<>(values);
        return new ArrayList<>(unique);
    }

    public List<String> removeDuplicatesUsingPrimitiveFor(List<String> values) {

        List<String> deduplicatedList = new ArrayList<>();
        for (String value : values) {
            boolean found = false;
            for (String s : deduplicatedList) {
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

    public List<String> removeDuplicatesUsingSetAndFor(List<String> values) {
        Set<String> uniqueSet = new HashSet<>();
        List<String> deduplicatedList = new ArrayList<>();

        for (String value : values) {
            if (uniqueSet.add(value)) {
                deduplicatedList.add(value);
            }
        }
        return deduplicatedList;
    }
}
