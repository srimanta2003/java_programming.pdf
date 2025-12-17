public class Q07_AbstractClass {
    static abstract class Printer {
        void start(){ System.out.println("Starting printer"); }
        abstract void print(String s);
    }
    static class InkPrinter extends Printer {
        void print(String s){ System.out.println("Ink printing: " + s); }
    }
    public static void main(String[] args){
        Printer p = new InkPrinter();
        p.start();
        p.print("Hello world");
    }
}
