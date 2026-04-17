import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int rno;
    transient int age;
    Student(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }
}