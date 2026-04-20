import java.io.*;

class BufferedReader3 {
    public static void main(String[] args) {
        try{
            BufferedReader b = new BufferedReader(new FileReader("test1.txt"));
            int ch;
            while((ch = b.read()) != -1) {
                System.out.print((char) ch);
            }
            b.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
