package edu.pvr.programs.list_intersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoLists<T> {

    public List<T> intersectionUsingPrimitive(List<T> leftItems, List<T> rightItems) {
        Set<T> setOfLeftItems = new HashSet<>(leftItems);
        List<T> intersection = new ArrayList<>();
        for (T rightItem : rightItems) {
            if (!setOfLeftItems.add(rightItem)) {
                intersection.add(rightItem);
            }
        }
        return intersection;
    }

    public List<T> intersectionUsingStreams(List<T> leftItems, List<T> rightItems) {
        Set<T> setOfLeftItems = new HashSet<>(leftItems);
        return rightItems.stream()
                .filter(rightItem -> !setOfLeftItems.add(rightItem))
                .collect(Collectors.toList());
    }

    public List<T> intersectionUsingStreamsAndContains(List<T> leftItems, List<T> rightItems) {
        return leftItems.stream()
                .filter(rightItems::contains)
                .collect(Collectors.toList());
    }
}
