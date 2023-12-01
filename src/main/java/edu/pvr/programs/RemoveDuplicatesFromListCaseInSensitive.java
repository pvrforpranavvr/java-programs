package edu.pvr.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListCaseInSensitive {

    public List<String> removeDuplicatesUsingStreamsDistinct(List<String> values) {
        return values.stream()
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList());

    }

    public List<String> removeDuplicatesUsingStreamsFilter(List<String> values) {
        Set<String> unique = new HashSet<>();
        return values.stream()
                .map(String::toLowerCase)
                .filter(unique::add)
                .collect(Collectors.toList());

    }


    public List<String> removeDuplicatesUsingPrimitiveFor(List<String> values) {

        List<String> deduplicatedList = new ArrayList<>();
        for (String value : values) {
            boolean found = false;
            for (String s : deduplicatedList) {
                if (value.equalsIgnoreCase(s)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                deduplicatedList.add(value.toLowerCase());
            }
        }
        return deduplicatedList;
    }

    public List<String> removeDuplicatesUsingSetAndFor(List<String> values) {
        Set<String> uniqueSet = new HashSet<>();
        List<String> deduplicatedList = new ArrayList<>();

        for (String value : values) {
            if (uniqueSet.add(value.toLowerCase())) {
                deduplicatedList.add(value.toLowerCase());
            }
        }
        return deduplicatedList;
    }
}
