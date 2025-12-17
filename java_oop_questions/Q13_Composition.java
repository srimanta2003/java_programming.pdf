public class Q13_Composition {
    static class Room { String name; Room(String n){ name = n; } }
    static class House {
        Room r;
        House(String roomName){ r = new Room(roomName); }
        void info(){ System.out.println("House has room: " + r.name); }
    }
    public static void main(String[] args){
        House h = new House("Living");
        h.info();
    }
}
