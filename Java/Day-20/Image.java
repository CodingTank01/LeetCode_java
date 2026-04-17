import java.io.*;
import javax.swing.*;

class Image {
    public static void main(String[] args) {
        try{
            FileInputStream fi = new FileInputStream("Image1.jpg");//Will read the image file from the current directory
            FileOutputStream fo = new FileOutputStream("stored_Image1.jpg");//Will create a new file named stored_felix.jpg in the current directory and write the image data into it

            byte[] buffer = new byte[8912];//Buffer to hold the image data while reading and writing
            int b;
            while((b=fi.read(buffer))!=-1){
                fo.write(buffer, 0, b);
            }
            fi.close();
            fo.close();
            System.out.print("Image has been stored successfully");

            JFrame j = new  JFrame("Pretty sky");//Creating a JFrame to display the image
            j.setSize(500, 500);
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ImageIcon i = new ImageIcon("stored_Image1.jpg");
            JLabel jl = new JLabel(i);
            j.add(jl);
            j.setVisible(true);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
