public class MazeGame {
    public Maze CreateMaze(){
        Maze aMaze=new Maze();



        Room r1 = new Room(1);
        Room r2=new Room(2);
        Room r1=CreateRoom(1);
        Room r2=CreateRoom(2);

        aMaze.AddRoom(r1);
        aMaze.AddRoom(r2);

        r1.SetSide("North", MakeWall());

        r1.SetSide("South", MakeWall());


        return aMaze;
    }

    //factory methods
    public Room CreateRoom(int roomNo){
        return new Room(roomNo);
    }
    public Wall MakeWall(){
        return new Wall();
    }



}


class BombedMazeGame extends MazeGame{


    //different implementations of factories
    @Override
    public Wall MakeWall(){
        return new BombedWall();
    }
    @Override
    public Room CreateRoom(int roomNo){
        return new RoomWithABomb(roomNo);
    }
}