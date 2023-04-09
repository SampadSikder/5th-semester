public interface Engine {
    public void start();
}

class SUVEngine implements Engine{

    public void start(){
        System.out.println("Suv engine running");
    }
}

class SedanEngine implements Engine{

    public void start(){
        System.out.println("Sedan engine running");
    }
}

