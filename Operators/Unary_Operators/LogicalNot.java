package Unary_Operators;

public class LogicalNot {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("Original value of a: " + a);
        System.out.println("Original value of b: " + b);

        boolean notA = !a;
        boolean notB = !b;

        System.out.println("Logical NOT of a: " + notA);
        System.out.println("Logical NOT of b: " + notB);
    }
}
