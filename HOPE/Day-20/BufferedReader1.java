import java.io.*;

class BufferedReader1 {
    public static void main(String[] args) {
        try {
            BufferedReader b = new BufferedReader(new FileReader("test1.txt"));
            int ch = b.read();
            System.out.print((char) ch);
            b.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
