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
    private int length;
    private int breadth;
    public Rect(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void Draw(){
        lines.add(new Line(this.length));
        lines.add(new Line(this.length));
        lines.add(new Line(this.breadth));
        lines.add(new Line(this.breadth));
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
    private int length;
    public Square(int length){

        this.length=length;
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
