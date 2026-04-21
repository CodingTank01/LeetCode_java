import java.util.*;
import java.util.stream.*;

class MethodRefDemo2 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Hello", "Hi", "Java");
        
        List<String> res = l.stream()
                            .map(String::toUpperCase)
                            .collect(Collectors.toList());
                            
        System.out.println(res);


    }    
}
