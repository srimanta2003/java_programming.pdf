public class Q04_PolymorphismRuntime {
    static class Animal {
        void sound(){ System.out.println("Some sound"); }
    }
    static class Cat extends Animal {
        @Override
        void sound(){ System.out.println("Meow"); }
    }
    static class Cow extends Animal {
        @Override
        void sound(){ System.out.println("Moo"); }
    }
    public static void main(String[] args){
        Animal a1 = new Cat();
        Animal a2 = new Cow();
        a1.sound();
        a2.sound();
    }
}
