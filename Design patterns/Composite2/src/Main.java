public class Main {
    public static void main(String[] args) {
        Equipments motherboard=new Motherboard();
        motherboard.addComponent(new CPU());
        Equipments storage=new Storage();
        storage.addComponent(new SSD());
        storage.addComponent(new HDD());

        motherboard.addComponent(storage);

        System.out.println(motherboard.calculatePrice());
    }
}