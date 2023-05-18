public class Main {
    public static void main(String[] args) {

        MilkAddon addon=new MilkAddon(new Espresso());
        System.out.println(addon.getCost());

    }
}