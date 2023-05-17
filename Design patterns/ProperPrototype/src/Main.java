public class Main {
    public static void main(String[] args) {

        ChipsetRegistry registry=new ChipsetRegistry();
        registry.chipsetCache();

        Chipset chipset = registry.getClone("Mediatek");

        System.out.println(chipset.toString());

        Chipset chipset1= registry.getClone("AMD");
        System.out.println(chipset1.toString());
    }
}