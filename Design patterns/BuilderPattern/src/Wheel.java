public interface Wheel {
    public void rotate();
}

class SUVWheel implements Wheel{

    public void rotate(){
        System.out.println("Suv wheel running");
    }
}

class SedanWheel implements Wheel{

    public void rotate(){
        System.out.println("Sedan wheel running");
    }
}
