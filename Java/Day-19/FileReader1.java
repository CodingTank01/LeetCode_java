import java.io.FileReader;
import java.io.IOException;

class FileReader1 {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("test1.txt");
        int i = f.read(); // Reads a single character from the file and returns its ASCII value
        System.out.println((char) i); // Casts the ASCII value to a character and
        f.close();
    }
}
