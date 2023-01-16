public class MazeBuilder {//eta ashole ekta interface hobe
    //er subclass e different implementation thakbe
    public void BuildMaze(){

    }
    public void BuildRoom(int room){

    }
    public void BuildDoor(int roomFrom, int roomTo){

    }
    public Maze GetMaze(){
        return null;
    }
    protected MazeBuilder(){

    }

}

class StandardMazeBuilder extends MazeBuilder{
    //implement
}
