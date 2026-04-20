import java.util.*;

class Student1 implements Comparable<Student1> {
    int marks;
    String name;

    Student1(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Student1 s) {   // FIXED spelling
        System.out.println("............");
        return this.marks - s.marks;   // ascending order
    }
}

class ComparableDemo {
    public static void main(String[] args) {

        List<Student1> list = new ArrayList<>();   // FIXED type

        list.add(new Student1(85, "ff"));
        list.add(new Student1(86, "fwtyf"));
        list.add(new Student1(89, "fef"));

        Collections.sort(list);   // FIXED class name

        for (Student1 a : list) {
            System.out.println(a.marks + " " + a.name);
        }
    }
}