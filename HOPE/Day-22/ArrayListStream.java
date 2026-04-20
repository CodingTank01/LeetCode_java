import java.util.*;
class ArrayListStream{
    public static void main(String[] args){
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);
        l.stream()
        .forEach(System.out::println);
    }
}