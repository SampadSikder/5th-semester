public class Rectangle implements Shape{
    int height, width;
    public int getArea(){
        return this.height*this.width;
    }
    public void setTopLeft(int x, int y){
        System.out.printf("Left %d, right %d",x,y);
    }
    public void setSize(int width, int height){
        this.height=height;
        this.width=width;
    }
    public void setColor(int color){
        System.out.println("Color set");
    }

}
