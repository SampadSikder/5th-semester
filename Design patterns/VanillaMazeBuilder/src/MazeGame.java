public class MazeGame {
    public Maze CreateMaze(){
        Maze aMaze=new Maze();

        Room r1=new Room(1);
        Room r2=new Room(2);

        aMaze.AddRoom(r1);
        aMaze.AddRoom(r2);

        r1.SetSide("North", new Wall());

    }



}
