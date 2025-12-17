public class Problem01_Student {
    static class Student {
        String name;
        int roll;
        int[] marks;
        Student(String name, int roll, int... marks){
            this.name = name;
            this.roll = roll;
            this.marks = marks;
        }
        double percentage(){
            int sum = 0;
            for(int m: marks) sum += m;
            return marks.length == 0 ? 0 : (sum * 100.0) / (marks.length * 100);
        }
        String grade(){
            double p = percentage();
            if(p >= 75) return "A";
            if(p >= 60) return "B";
            if(p >= 50) return "C";
            return "F";
        }
        public String toString(){
            return name + " (Roll: " + roll + ") -> " + String.format("%.2f", percentage()) + "% Grade:" + grade();
        }
    }
    public static void main(String[] args){
        Student s1 = new Student("Anita", 21, 85, 78, 92);
        Student s2 = new Student("Rahul", 22, 56, 63, 48);
        System.out.println(s1);
        System.out.println(s2);
    }
}