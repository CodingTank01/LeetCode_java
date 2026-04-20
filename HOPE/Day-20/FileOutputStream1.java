import java.io.*;

class FileOutputStream1{
    public static void main(String[] args) {
        try{
            FileOutputStream f = new FileOutputStream("test3.txt");// Creates a new file named "test3.txt" or overwrites it if it already exists, and prepares to write data to it using a FileOutputStream
            f.write("I love Java".getBytes());// Writes the string "I love Java" to the file as bytes using the getBytes() method to convert the string into a byte array
            f.write('\n');// Writes a newline character to the file to move to the next line after writing the string
            f.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
