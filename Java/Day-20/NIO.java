import java.io.File;
import java.nio.file.*;

class NIO {
    public static void main(String[] args) {
        try{
            Path p = Paths.get("NIO_test.txt");
            Files.writeString(p, "Hello World");
            String s = Files.readString(p);
            System.out.println(s);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
