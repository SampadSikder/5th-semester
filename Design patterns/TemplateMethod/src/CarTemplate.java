public abstract class CarTemplate {
    public final void makeCar(){
        makeWheel();
        makeEngine();
        startEngine();
        rotateWheel();
    }

    public abstract void makeWheel();
    public abstract void makeEngine();
    public abstract void startEngine();
    public abstract void rotateWheel();
}


class Car extends CarTemplate{
    private Wheel wheel;
    private Engine engine;

    private CarFactory factory;

    public Car(CarFactory factory){
        this.factory=factory;
    }
    public void makeWheel() {
        this.wheel = this.factory.WheelFactory();

    }
    public void makeEngine() {
        this.engine = this.factory.EngineFactory();
    }
    public void startEngine(){
        this.engine.start();
    }
    public void rotateWheel(){
        this.wheel.rotate();
    }

}
