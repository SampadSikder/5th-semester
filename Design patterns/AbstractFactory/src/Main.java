public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MazeGame game=new MazeGame();
        game.CreateMaze(new DefaultMazeFactory());
    }
}