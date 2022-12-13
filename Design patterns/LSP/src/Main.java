public class Main {
    public static void main(String[] args) {
        //Here we substitute the instantiation with superclass name and still get valid data.
        Shape rect = new Rectangle(5,4);
        System.out.println("Area of rectangle: "+rect.getArea());
        Shape square = new Square(5);
        System.out.println("Area of rectangle: "+square.getArea());

    }
}