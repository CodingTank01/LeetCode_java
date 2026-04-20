import java.util.*;

class ArrayListStream2 {
    //Finding sum of elements
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        int sum = l.stream()
            .reduce(0, (a,b) -> a+b );

        System.out.println(sum);     
    }
}
