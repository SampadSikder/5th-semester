public class Rectangle implements Shape{
    int height, width;
    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    public int getArea(){
        return this.height*this.width;
    }
    public void setColor(int color){
        System.out.println("Color set");
    }
    public void draw(){
        //draw the shape
    }

}
