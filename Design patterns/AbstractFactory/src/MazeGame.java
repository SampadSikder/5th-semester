public class MazeGame {
    public Maze CreateMaze(MazeFactory factory){
        Maze aMaze=new Maze();

        Room r1=factory.CreateRoom(1);
        Room r2=factory.CreateRoom(2);

        aMaze.AddRoom(r1);
        aMaze.AddRoom(r2);

        r1.SetSide("North", factory.MakeWall());
        r1.SetSide("South", factory.MakeWall());


        return aMaze;
    }

}
abstract class MazeFactory{

    private static MazeFactory instance=null;
    //singleton subclassing implementation
    public MazeFactory MazeFactory(String type) {
        if(instance==null) {
            if(type.equals("bombed")) {
                instance=new BombedMazeFactory();
            }
            else if(type.equals("Normal")) {
                instance=new DefaultMazeFactory();
            }

        }
         return instance;
    }
    //factory methods
    public abstract Room CreateRoom(int roomNo);


    public abstract Wall MakeWall();

}

class DefaultMazeFactory extends MazeFactory{
    //factory methods
    @Override
    public Room CreateRoom(int roomNo){
        return new Room(roomNo);
    }
    @Override
    public Wall MakeWall(){
        return new Wall();
    }
}

class BombedMazeFactory extends MazeFactory{
    @Override
    public Room CreateRoom(int roomNo){
        return new BombedRoom(roomNo);
    }
    @Override
    public Wall MakeWall(){
        return new BombedWall();
    }
}
}
