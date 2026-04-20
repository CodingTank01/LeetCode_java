import java.nio.file.*;

class NIO {
    public static void main(String[] args) {
        try{    
            Path p = Paths.get("NIO_test.txt");

            Files.writeString(p, "Hello World");
            String s1 = Files.readString(p);//gives a single line of text
            
            System.out.println(s1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
