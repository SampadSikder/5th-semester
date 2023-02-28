import java.util.ArrayList;

public abstract class Shape {
    public abstract void Draw();
    public abstract int getShape();
    public abstract void checkShape();

}
class Line extends Shape{
    private int length;
    public Line(int length){
        this.length=length;
    }
    public void Draw(){
        System.out.println("Abjline");
    }
    public int getShape(){
        return this.length;
    }
    public void checkShape(){

    }

}
class Rect extends Shape{
    private ArrayList<Shape> lines=new ArrayList<>();
    public Rect(ArrayList<Shape> lines){
        this.lines=lines;
        this.checkShape();
    }
    public void Draw(){
        System.out.println("Abjrect");
    }
    public int getShape(){
        return 0;
    }
    public void checkShape(){
        int length1=lines.get(0).getShape();
        int length2=lines.get(1).getShape();
        if(lines.get(2).getShape()==length1&&length2==lines.get(3).getShape()){
            System.out.println("rect");
        }
        else{
            System.out.println("hoy nai");
        }
    }

}
class Square extends Shape{
    private ArrayList<Shape> lines=new ArrayList<>();
    public Square(ArrayList<Shape> lines){
        this.lines=lines;
    }
   public void checkShape(){
        int length=lines.get(0).getShape();
        for(Shape line:lines){
            if(line.getShape()!=length) {
                System.out.println("Square hoy nai");
                break;
            }
        }

    }
    public void Draw(){
        System.out.println("Abjrect");
    }
    public int getShape(){
        return 0;
    }
}
