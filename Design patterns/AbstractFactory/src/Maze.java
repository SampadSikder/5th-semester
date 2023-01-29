import java.util.ArrayList;

public class Maze {

    private ArrayList<Room> rooms=new ArrayList<>();
    public void AddRoom(Room room){
        rooms.add(room);
    }
    public Room RoomNo(int roomNo){
        return rooms.get(roomNo);
    }
}
