public class MazeGame {
    public Maze createMaze(){
        Maze maze= new Maze();

        Room r1=makeRoom(1);
        Room r2=makeRoom(2);

        Door theDoor=new Door(r1,r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide("North", MakeWall());
        r1.setSide("East", MakeWall());
        r1.setSide("South",MakeWall());
        r1.setSide("West",theDoor);

        r2.setSide("North", MakeWall());
        r2.setSide("East", theDoor);
        r2.setSide("South",MakeWall());
        r2.setSide("West",MakeWall());

        return maze;

    }
    public Room makeRoom(int numberOfRooms){
        return new NormalRoom(numberOfRooms);
    }
    public Wall MakeWall(){
        return new NormalWall();
    }
}

class BombedMazeGame extends MazeGame{
    public BombedMazeGame(){

    }
    @Override
    public Wall MakeWall(){
        return new BombedWall();
    }
    @Override
    public Room makeRoom(int n){
        return new RoomWithABomb(n);
    }
}