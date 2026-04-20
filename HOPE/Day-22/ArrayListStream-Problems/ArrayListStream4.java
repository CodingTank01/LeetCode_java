import java.util.*;
import java.util.stream.*;

class ArrayListStream4 {
    //Counting even and odd elements 
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        Map<String, Long> res = l.stream()
            .collect(Collectors.groupingBy(x -> x%2==0 ? "Even" : "Odd",
            Collectors.counting()
        ));

        System.out.print(res);
    }
}