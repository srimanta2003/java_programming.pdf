public class Q03_PolymorphismCompileTime {
    static class MathUtil {
        int add(int a, int b){ return a + b; }
        double add(double a, double b){ return a + b; }
        int add(int a, int b, int c){ return a + b + c; }
    }
    public static void main(String[] args){
        MathUtil mu = new MathUtil();
        System.out.println(mu.add(2,3));
        System.out.println(mu.add(2.5,3.2));
        System.out.println(mu.add(1,2,3));
    }
}
