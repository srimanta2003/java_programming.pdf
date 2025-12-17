public class Q16_AnonymousClasses {
    interface Greeter { void greet(); }
    public static void main(String[] args){
        Greeter g = new Greeter(){ public void greet(){ System.out.println("Hey, I'm anonymous"); } };
        g.greet();
    }
}
