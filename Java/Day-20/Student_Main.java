import java.io.*;

class Student_Main{
    public static void main(String[] args) {
        try{
            Student s1 = new Student("Juli", 1);
            Student s2 = new Student("Aravind", 2);
            FileOutputStream f = new FileOutputStream("student.txt");
            ObjectOutputStream obj = new ObjectOutputStream(f);
            obj.writeObject(s1);
            obj.writeObject(s2);    
            obj.close();    
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}