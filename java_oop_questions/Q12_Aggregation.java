import java.util.*;
public class Q12_Aggregation {
    static class Student { String name; Student(String n){ name=n; } }
    static class Department {
        String name; List<Student> students;
        Department(String name, List<Student> students){ this.name=name; this.students=students; }
        void show(){
            System.out.println(name + " students:");
            for(Student s: students) System.out.println(s.name);
        }
    }
    public static void main(String[] args){
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Rohit"));
        studs.add(new Student("Sneha"));
        Department d = new Department("CS", studs);
        d.show();
    }
}
