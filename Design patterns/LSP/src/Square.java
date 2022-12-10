public class Square implements Shape{
    int size;
    public Square(int size){
        this.size=size;
    }
    public int getArea(){
        return size*size;
    }
    public void setColor(int color){
        System.out.println("Color is "+color);
    }
    public void draw(){
        System.out.println("Drawn square");
    }
}
