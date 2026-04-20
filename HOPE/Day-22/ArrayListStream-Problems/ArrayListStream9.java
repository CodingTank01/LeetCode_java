import java.util.Arrays;
import java.util.List;

class ArrayListStream9 {
    //count the number of elements
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        long sum = l.stream()
        .count();
        System.out.println(sum);
    }    
}
