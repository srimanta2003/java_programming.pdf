public class Q17_ExceptionHandlingOOP {
    static class AgeException extends Exception { AgeException(String m){ super(m); } }
    static class Person {
        String name; int age;
        Person(String n,int a) throws AgeException { if(a<0) throw new AgeException("Age can't be negative"); name=n; age=a; }
        void show(){ System.out.println(name + " is " + age); }
    }
    public static void main(String[] args){
        try{
            Person p = new Person("Karan", -1);
            p.show();
        }catch(Exception e){ System.out.println("Error: " + e.getMessage()); }
    }
}
