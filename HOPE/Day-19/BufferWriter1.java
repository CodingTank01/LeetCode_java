import java.io.*;

class BufferWriter1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter b = new BufferedWriter(new FileWriter("test1.txt")); // Creates a BufferedWriter object to write to the specified file
        b.write("The class has finished.");
        b.newLine(); // Writes a new line to the file
        b.write("The class can go to lunch.");

        b.close();

    }
}
