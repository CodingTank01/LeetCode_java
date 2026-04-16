import java.io.File;
import java.io.IOException;

class FileHandling2 {
    public static void main(String[] args) {
            File f = new File("test1.txt");// Creates a File object with the specified name
            if(f.exists()){ // Checks if the file exists
                System.out.println("File already exists.");
            }
            f.delete(); // Deletes the file if it exists
            if(f.exists()){
                System.out.println("File still exists."); //Does not execute as the file is deleted
            }
    }
}
