import java.io.FileWriter;
import java.io.IOException;

class FileWriter1 {
    public static void main(String[] args) throws IOException{
        FileWriter fw1 = new FileWriter("test1.txt"); // Creates a FileWriter object to write to the specified file
        fw1.write("hello hi");

        FileWriter fw2 = new FileWriter("test2.txt");
        /* Automatically creates the file if it doesn't exist (The exception is handled in the background code) */
        fw2.write("hello world");

        fw1.close();
        fw2.close();
    }
}
