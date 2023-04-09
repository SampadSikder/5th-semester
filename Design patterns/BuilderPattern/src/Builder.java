public class Builder {
    private Engine engine;
    private Wheel wheel;

    public Builder() {
    }

    public Builder withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Builder withWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    public Car build() {
        if (engine == null || wheel == null) {
            throw new IllegalStateException("Engine and wheel cannot be null");
        }

        return new Car(engine, wheel);
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
