public class Main {
    public static void main(String[] args) {
        Prototype door1=new Door(100, "North");
        Door door2=(Door)door1.clone();

        Room room1=new Room();
        room1.addDoor(door1);
        room1.addDoor(door2);
        Room room2=(Room)room1.clone();

        room1.getInfo();
        room2.getInfo();
    }
}