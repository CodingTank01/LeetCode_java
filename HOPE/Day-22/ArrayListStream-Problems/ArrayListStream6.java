import java.util.*;

class ArrayListStream6 {
    //Only keep even elements
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        l.stream()
        .filter(x -> x%2==0)
        .forEach(System.out::println);
    }    
}
