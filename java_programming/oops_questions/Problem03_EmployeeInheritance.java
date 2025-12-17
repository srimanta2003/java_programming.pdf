public class Problem03_EmployeeInheritance {
    static class Employee {
        String name;
        double salary;
        Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        double calculateBonus(){
            return salary * 0.05;
        }
        public String toString(){
            return name + " earns " + salary + " bonus:" + calculateBonus();
        }
    }
    static class Manager extends Employee {
        int teamSize;
        Manager(String name, double salary, int teamSize){
            super(name, salary);
            this.teamSize = teamSize;
        }
        @Override
        double calculateBonus(){
            return salary * 0.1 + teamSize * 50;
        }
    }
    public static void main(String[] args){
        Employee e = new Employee("Suman", 30000);
        Manager m = new Manager("Rita", 60000, 6);
        System.out.println(e);
        System.out.println(m);
    }
}