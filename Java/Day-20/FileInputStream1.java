import java.io.*;

class FileInputStream1 {
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("test3.txt"); // test3.txt is created by FileOutputStream1.java
            int ch;
            while((ch = f.read()) != -1) {
                System.out.print((char) ch);// Reads bytes until the end of the file is reached (indicated by -1) and casts them to characters for display
            }
            f.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
