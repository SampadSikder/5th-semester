public class Main {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        Beverage addon=new Addon();
        addon.addon(new SugarAddon());
        addon.addon(new MilkAddon());
        double totalPrice=beverage.getCost()+ addon.getCost();
        System.out.println("total price: "+totalPrice);

    }
}