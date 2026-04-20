import java.util.*;
import java.util.stream.*;

class ArrayListStream5 {
    //Frequency of elements

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,1,2,3,3,1,2,1,2);

        Map<Integer, Long> res = l.stream()
            .collect(Collectors.groupingBy(
                x->x,
                Collectors.counting()
        ));
        
        System.out.println(res);
    }    
}
