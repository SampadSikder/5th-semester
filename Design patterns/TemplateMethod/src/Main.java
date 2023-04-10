public class Main {
    public static void main(String[] args) {

        CarTemplate car=new Car(new SUVFactory());
        car.makeCar();
    }
}