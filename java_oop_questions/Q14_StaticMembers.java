public class Q14_StaticMembers {
    static class Counter {
        static int count = 0;
        Counter(){ count++; }
        static void show(){ System.out.println("Total: " + count); }
    }
    public static void main(String[] args){
        new Counter();
        new Counter();
        Counter.show();
    }
}
