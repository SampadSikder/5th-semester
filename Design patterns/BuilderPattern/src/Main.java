public class Main {
    public static void main(String[] args) {
        Car suv = new Builder()
                .withEngine(new SUVEngine())
                .withWheel(new SUVWheel())
                .build();
        suv.run();

        Car sedan = new Builder()
                .withEngine(new SedanEngine())
                .withWheel(new SedanWheel())
                .build();
        sedan.run();
    }
}