public class Q06_Interface {
    interface Movable { void move(); }
    static class Car implements Movable {
        String name;
        Car(String n){ name = n; }
        public void move(){ System.out.println(name + " is driving"); }
    }
    public static void main(String[] args){
        Movable m = new Car("Swift");
        m.move();
    }
}
