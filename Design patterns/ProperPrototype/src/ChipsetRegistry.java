import java.util.HashMap;

public class ChipsetRegistry { //this will have a factory
    private HashMap<String, Chipset> cache=new HashMap<>();

    public void chipsetCache(){ //factory method
        MobileChipset chipset=new MobileChipset();
        chipset.setModel("Mediatek dimensity");
        chipset.setE_sim(true);
        chipset.setGps(new GPS());

        PCChipset chipset1=new PCChipset();
        chipset1.setModel("AMD Ryzen 9400g");
        chipset1.setPci_e(true);

        cache.put("Mediatek",chipset);
        cache.put("AMD",chipset1);
    }

    public Chipset getClone(String key){
        return this.cache.get(key).clone();
    }

}
