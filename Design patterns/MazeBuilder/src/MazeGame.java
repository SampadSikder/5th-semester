public class MazeGame {
    public Maze createMaze(){
        Maze maze= new Maze();

        MazeBuilder mazeBuilder=new MazeBuilder();

        mazeBuilder.BuildMaze();
        mazeBuilder.BuildRoom(2);
        mazeBuilder.BuildRoom(1);
        mazeBuilder.BuildDoor(1,2);

        return mazeBuilder.GetMaze();

        /*Room r1=makeRoom(1);
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

        return maze;*/

    }
    public Maze createComplexMaze(MazeBuilder builder){
        builder.BuildRoom(1);
        builder.BuildRoom(1001);
        return builder.GetMaze();
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