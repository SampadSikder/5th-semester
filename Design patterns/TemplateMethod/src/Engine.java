public interface Engine {
    public void start();
}

class SUVEngine implements Engine{


    public void start(){
        System.out.println("SUV engine starts");
    }
}

class SedanEngine implements Engine{
    public void start(){
        System.out.println("Sedan engine starts");
    }
}
