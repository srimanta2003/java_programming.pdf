public class Q01_Encapsulation {
    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }
        public void setName(String n) { name = n; }
        public int getAge() { return age; }
        public void setAge(int a) { age = a; }
    }

    public static void main(String[] args) {
        Student s = new Student("Aman", 21);
        System.out.println(s.getName() + " is " + s.getAge() + " years old");
        s.setAge(22);
        System.out.println("After birthday: " + s.getName() + " is " + s.getAge());
    }
}
