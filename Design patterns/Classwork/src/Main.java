import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        //if we replace the subclass name with superclass during instantiation, it will still work as per LSV
        Shape rect=new Rectangle(5,4); //rectangle is a shape
        System.out.println(rect.getArea());
        Rectangle sq=new Square(5);//square is a rectangle
        System.out.println(sq.getArea());

        //another way is to directly implement shape class from square instead of extending rectangle
        /*Shape rect = new Rectangle(5,4);
        System.out.println("Area of rectangle: "+rect.getArea());
        Shape square = new Square(5);
        System.out.println("Area of rectangle: "+square.getArea());*/
    }
}