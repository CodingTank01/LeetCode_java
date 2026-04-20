import java.util.*;

class Student2{
    int marks;
    String name;

    Student2(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    // Inner Comparator class
    static class myTask implements Comparator<Student2> {
        public int compare(Student2 a, Student2 b) {
            return a.marks - b.marks;
        }
    }
}

class ComparatorDemo {
    public static void main(String[] args) {

        List<Student2> list = new ArrayList<>();

        list.add(new Student2(85, "ff"));
        list.add(new Student2(86, "fwtyf"));
        list.add(new Student2(89, "fef"));

        Collections.sort(list, new Student2.myTask());  // FIXED

        for (Student2 a : list) {
            System.out.println(a.marks + " " + a.name);
        }
    }
}