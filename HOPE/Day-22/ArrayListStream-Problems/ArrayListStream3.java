import java.util.*;
import java.util.stream.*;

class ArrayListStream3 {
    //Grouping by elements in terms even or odd
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        Map<String, List<Integer>> res = l.stream()
            .collect(Collectors.groupingBy(x -> x%2==0 ? "Even" : "Odd"));

        System.out.print(res);
    }
}
