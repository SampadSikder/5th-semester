public interface VehicleFactory {
    public Engine createEngine();
    public Wheel createWheel();
}

class SUVFactory implements VehicleFactory {
    public Engine createEngine() {
        return new SUVEngine();
    }
    public Wheel createWheel() {
        return new SUVWheel();
    }
}

class SedanFactory implements VehicleFactory {
    public Engine createEngine() {
        return new SedanEngine();
    }
    public Wheel createWheel() {
        return new SedanWheel();
    }
}

class Car {
    private Engine engine;
    private Wheel wheel;
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }
    public void run() {
        this.engine.start();
        this.wheel.rotate();
    }
}