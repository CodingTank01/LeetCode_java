import java.util.Optional;
import java.util.*;

class OptionalClassDemo {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        //The usual way to avoid nullPointerExceptions
        try{
            String name = null;
            System.out.println(name.length());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        //Using if/else block to catch nullPointerExceptions
        String name2 = null;
        if(name2!=null) System.out.println("hi");

        //Handling nullPointerException with optional class(JAVA8)
        String name3 = "JAVA";
        Optional<String> op = Optional.ofNullable(name3);
        System.out.println(op);

        //Handling nullPointerException with optional class(JAVA8)
        Optional<String> op2 = Optional.ofNullable(null);
        String res = op2
        .map(String::toUpperCase)
        .orElse("No Name");
        System.out.println(res);

        
        List<String> s = Arrays.asList("Java", "hi", "hello");
        

    }    
}
