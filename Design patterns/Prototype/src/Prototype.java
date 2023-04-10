import java.util.ArrayList;

public interface Prototype {
    public Prototype clone();
    public void getInfo();
}

class Room implements Prototype{
    private ArrayList<Prototype>doors=new ArrayList<>();

    public void addDoor(Prototype door){
        doors.add(door);
    }
    @Override
    public Prototype clone() {
        return this;
    }
    public void getInfo(){
        System.out.println("Room with "+doors.size()+" doors");
        for(Prototype door:doors){
            door.getInfo();
        }
    }
}

class Door implements Prototype{
    private int doorLength;
    private String direction;
    public Door(int doorLength, String direction){
        this.doorLength=doorLength;
        this.direction=direction;
    }
    public Prototype clone(){
        return this;
    }
    public void getInfo(){
        System.out.println("Door with length"+this.doorLength);
        System.out.println("Door with direction"+this.direction);
    }
}