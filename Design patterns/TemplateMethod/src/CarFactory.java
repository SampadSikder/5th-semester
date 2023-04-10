public interface CarFactory {
    public Engine EngineFactory();
    public Wheel WheelFactory();
}

class SUVFactory implements CarFactory{

    @Override
    public Engine EngineFactory() {
        return new SUVEngine();
    }
    public Wheel WheelFactory() {
        return new SUVWheel();
    }
}

class SedanFactory implements CarFactory{

    @Override
    public Engine EngineFactory() {
        return new SedanEngine();
    }
    public Wheel WheelFactory() {
        return new SedanWheel();
    }
}

