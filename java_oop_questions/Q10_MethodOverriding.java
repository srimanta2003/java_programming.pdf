public class Q10_MethodOverriding {
    static class Parent {
        void show(){ System.out.println("Parent show"); }
    }
    static class Child extends Parent {
        @Override
        void show(){ System.out.println("Child show"); }
    }
    public static void main(String[] args){
        Parent p = new Child();
        p.show();
    }
}
