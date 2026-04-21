package Stream_practice;
import java.util.*;
import java.util.stream.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Lotus", "Lotus", "Lily", "Jasmine");
        l.stream()
        .distinct()
        .forEach(System.out::println);
    }
}
