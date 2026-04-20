import java.io.FileReader;
import java.io.IOException;

class FileReader2 {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("test2.txt");
        int ch;
        while((ch=f.read())!=-1) { // Reads characters until the end of the file is reached (indicated by -1)
                System.out.print((char) ch);
        }
        f.close();
    }

}
