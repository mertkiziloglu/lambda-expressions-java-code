package org.meroot;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreLambdas {

    public static void main(String[] args) {

        List<String> strings =
                new ArrayList<>(List.of("one", "two", "three", "four", "five"));

        List<Integer> ınteger =
                new ArrayList<>(List.of(1, 12, 3, 4,5));

        strings.removeIf(string -> !string.startsWith("t"));
        ınteger.removeIf(integer -> integer.equals(1));
        strings.forEach(string -> System.out.println(strings));
        strings.forEach(string -> System.out.println(ınteger));
    }
}
