import java.io.*;

class FileOutputStream1{
    public static void main(String[] args) {
        try{
            FileOutputStream f = new FileOutputStream("test3.txt");
            f.write("I love Java".getBytes());
            f.write('\n');
            f.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
