public class Main {
    public static void main(String[] args) {

        Addon addon=new MilkAddon(new Espresso());
        System.out.println(addon.getCost());

    }
}