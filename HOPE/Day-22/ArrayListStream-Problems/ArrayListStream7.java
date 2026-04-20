import java.util.Arrays;
import java.util.List;

class ArrayListStream7 {
    //Square all elements
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        l.stream()
        .map(x->x*x)
        .forEach(System.out::println);
    }
}
