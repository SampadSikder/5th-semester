public interface Wheel {
    public void rotate();
}

class SUVWheel implements Wheel{
    public void rotate(){
        System.out.println("SUV wheel rotating");
    }
        }
class SedanWheel implements Wheel{
    public void rotate(){
        System.out.println("Sedan wheel rotating");
    }
}