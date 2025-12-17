public class Q05_Abstraction {
    static abstract class Shape {
        abstract double area();
        void show(){ System.out.println("Area: " + area()); }
    }
    static class Circle extends Shape {
        double r;
        Circle(double r){ this.r = r; }
        @Override
        double area(){ return Math.PI * r * r; }
    }
    public static void main(String[] args){
        Shape c = new Circle(3);
        c.show();
    }
}
