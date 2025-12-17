public class Problem04_ShapesPolymorphism {
    static abstract class Shape {
        abstract double area();
        abstract double perimeter();
    }
    static class Circle extends Shape {
        double r;
        Circle(double r){ this.r = r; }
        double area(){ return Math.PI * r * r; }
        double perimeter(){ return 2 * Math.PI * r; }
    }
    static class Rectangle extends Shape {
        double w,h;
        Rectangle(double w,double h){ this.w=w;this.h=h; }
        double area(){ return w*h; }
        double perimeter(){ return 2*(w+h); }
    }
    public static void main(String[] args){
        Shape[] shapes = { new Circle(3), new Rectangle(4,5) };
        for(Shape s: shapes) System.out.println(s.getClass().getSimpleName() + " area=" + s.area());
    }
}