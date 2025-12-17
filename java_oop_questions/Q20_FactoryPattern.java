public class Q20_FactoryPattern {
    interface Shape { void draw(); }
    static class Circle implements Shape { public void draw(){ System.out.println("Circle drawn"); } }
    static class Square implements Shape { public void draw(){ System.out.println("Square drawn"); } }
    static class Factory {
        static Shape get(String t){ if("circle".equalsIgnoreCase(t)) return new Circle(); return new Square(); }
    }
    public static void main(String[] args){
        Shape s1 = Factory.get("circle");
        Shape s2 = Factory.get("square");
        s1.draw(); s2.draw();
    }
}
