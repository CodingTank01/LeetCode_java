import java.io.*;

class BufferedReader4 {
    public static void main(String[] args) {
        try {
            BufferedReader b = new BufferedReader(new FileReader("test1.txt"));
            String s;
            while((s = b.readLine()) != null) {
                System.out.println(s);
            }
            b.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
