import java.util.Arrays;
import java.util.List;

class ArrayListStream8 {
    //Print all unique values
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,5,6);
        l.stream()
        .distinct()
        .forEach(System.out::println);
    }    
}
