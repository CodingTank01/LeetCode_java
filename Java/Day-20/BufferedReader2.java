import java.io.*;


class BufferedReader2 {
    public static void main(String[] args) {
        try {
            BufferedReader b = new BufferedReader(new FileReader("test1.txt"));
            String s = b.readLine();
            System.out.println(s);
            b.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
