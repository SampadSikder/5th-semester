import java.util.ArrayList;

abstract class MapSite {
    public abstract void Enter();
}

class Room extends MapSite{
    private ArrayList<MapSite> _sides=new ArrayList<>(4);
    private int _roomNumber;

    public Room(int _roomNumber){
        this._roomNumber=_roomNumber;
    }
    public MapSite GetSide(String Direction){
        return _sides.get(0);
    }
    public void SetSide(String Direction, MapSite mapSite){

    }

    public void Enter(){
        System.out.println("Entered room: "+_roomNumber);
    }
}
class Wall extends MapSite{
    public Wall(){

    }
    public void Enter(){
        System.out.println("Hit wall!");
    }
}

class Door extends MapSite{
    private Room _room1;
    private Room _room2;
    private boolean _isOpen;

    public Door(Room _room1, Room _room2){
        this._room1=_room1;
        this._room2=_room2;
    }

    public Room otherSideFrom(Room room){
        if(room==_room1){
            return _room2;
        }
        return _room1;
    }
    public void Enter(){
        System.out.println("Going through open door");
    }
}