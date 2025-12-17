import java.util.*;
public class Q19_ObserverPatternSimple {
    interface Observer { void update(String msg); }
    static class Subject {
        List<Observer> list = new ArrayList<>();
        void add(Observer o){ list.add(o); }
        void notifyAllObs(String m){ for(Observer o: list) o.update(m); }
    }
    public static void main(String[] args){
        Subject s = new Subject();
        s.add(msg -> System.out.println("Obs1 got: " + msg));
        s.add(msg -> System.out.println("Obs2 got: " + msg));
        s.notifyAllObs("Update available");
    }
}
