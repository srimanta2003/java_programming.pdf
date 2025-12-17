public class Q02_Inheritance {
    static class Animal {
        String name;
        Animal(String n){ name = n; }
        void move(){ System.out.println(name + " moves"); }
    }
    static class Dog extends Animal {
        Dog(String n){ super(n); }
        void bark(){ System.out.println(name + " says: Woof!"); }
    }
    public static void main(String[] args){
        Dog d = new Dog("Buddy");
        d.move();
        d.bark();
    }
}
