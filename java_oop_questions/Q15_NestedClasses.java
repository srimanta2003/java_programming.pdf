public class Q15_NestedClasses {
    static class Outer {
        int x = 5;
        class Inner { int getX(){ return x; } }
        static class StaticInner { static int val(){ return 100; } }
    }
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println(i.getX());
        System.out.println(Outer.StaticInner.val());
    }
}
