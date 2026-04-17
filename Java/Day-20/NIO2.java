import java.io.File;
import java.nio.file.*;
import java.util.*;

class NIO2 {
    public static void main(String[] args) {
        try{    
            List<String> s = Arrays.asList("Hi", "Hello", "Great");
            Path p = Paths.get("NIO_test.txt");

            Files.write(p, s);

            List<String> s1 = Files.readAllLines(p);
            System.out.println(s1.toString());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
