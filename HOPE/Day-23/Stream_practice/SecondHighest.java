package Stream_practice;
import java.util.*;
import java.util.stream.*;

class SecondHighest {
    public static void main(String[] args){
        List<Integer> l = Arrays.asList(1,2,5,6,4,7,8,9);
        int num = l.stream()
                  .distinct()
                  .sorted(Comparator.reverseOrder())
                  .skip(1)
                  .findFirst()
                  .orElse(-1);

        System.out.println("Second highest: " + num);
                  
    }    
}
