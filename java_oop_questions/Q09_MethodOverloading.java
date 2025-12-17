public class Q09_MethodOverloading {
    static class Calculator {
        int mul(int a,int b){ return a*b; }
        int mul(int a,int b,int c){ return a*b*c; }
        double mul(double a,double b){ return a*b; }
    }
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.mul(2,3));
        System.out.println(c.mul(2,3,4));
        System.out.println(c.mul(2.5, 4.0));
    }
}
