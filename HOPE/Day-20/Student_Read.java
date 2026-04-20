import java.io.*;

class Student_Read {
    public static void main(String[] args){
        try{
            FileInputStream f = new FileInputStream("student.txt");
            ObjectInputStream obj = new ObjectInputStream(f);
            Student s1 = (Student) obj.readObject();
            Student s2 = (Student) obj.readObject();
            System.out.println(s1.name + " " + s1.rno + " " + s1.age);
            System.out.println(s2.name + " " + s2.rno + " " + s2.age);
            obj.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
