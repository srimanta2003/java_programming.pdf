public class Q08_ConstructorOverloading {
    static class Box {
        int l,w,h;
        Box(){ l=w=h=1; }
        Box(int a,int b,int c){ l=a; w=b; h=c; }
        int volume(){ return l*w*h; }
    }
    public static void main(String[] args){
        Box b1 = new Box();
        Box b2 = new Box(2,3,4);
        System.out.println("b1 vol=" + b1.volume());
        System.out.println("b2 vol=" + b2.volume());
    }
}
