import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Shape rect=new Rectangle();
        rect.setSize(5,4);
        System.out.println(rect.getArea());
        Square sq=new Square();
        sq.setSize(5);
        System.out.println(sq.getArea());
    }
}