package Stream_practice;

import java.util.*;
import java.util.stream.*;

public class UpperCaseStrings {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Aravind", "Barath", "Vijaya Raghavan", "Sriram", "Selva");
        l.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);
    }
}
