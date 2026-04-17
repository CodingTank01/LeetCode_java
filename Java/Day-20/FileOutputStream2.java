import java.io.*;

class FileOutputStream2 {
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("test3.txt");
            int ch;
            while((ch = f.read()) != -1) {
                System.out.print((char) ch);
            }
            f.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
