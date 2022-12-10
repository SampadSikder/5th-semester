public class Rectangle implements Shape{
    int length, breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getArea(){
        return length*breadth;
    }
    public void setColor(int color){
        System.out.println("Color is "+color);
    }
    public void draw(){
        System.out.println("Drawn rectangle");
    }

}
