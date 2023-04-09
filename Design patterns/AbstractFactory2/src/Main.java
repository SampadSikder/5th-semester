public class Main {
    public static void main(String[] args) {
        VehicleFactory suvFactory = new SUVFactory();
        Car suv = new Car(suvFactory.createEngine(), suvFactory.createWheel());
        suv.run();

        VehicleFactory sedanFactory = new SedanFactory();
        Car sedan = new Car(sedanFactory.createEngine(), sedanFactory.createWheel());
        sedan.run();

    }
}