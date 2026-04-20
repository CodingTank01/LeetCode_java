import java.io.File;
import java.io.IOException;

class FileHandling{
    public static void main(String[] args){
        try{
            File f = new File("test1.txt");// Creates a File object with the specified name
            if(f.createNewFile()){ // Creates a new file if it doesn't exist
                System.out.println("File created: " + f.getName());
            } 
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace(); // Explains the error briefly
        } 
    }
}