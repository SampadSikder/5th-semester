import javax.accessibility.AccessibleValue;
import java.util.ArrayList;

public interface Beverage {

    public double getCost();
}

class Espresso implements Beverage{

    public double getCost(){
        return 10.0;
    }
}
class Mocha implements Beverage{

    public double getCost(){
        return 10.0;
    }
}

class Addon implements Beverage{

    private Beverage beverage;
    public Addon(){

    }
    public Addon(Beverage beverage){
        this.beverage=beverage;
    }
    public double getCost(){
        double price=0;

        return price;
    }
}

class MilkAddon extends Addon{

    private Beverage beverage;
    public MilkAddon(Beverage beverage){
        this.beverage=beverage;
    }
    public double getCost(){
        double price=5.0;
        price+= beverage.getCost();
        System.out.println("Extra milk");
        return price;
    }
}
class SugarAddon extends Addon{

    private Beverage beverage;
    public SugarAddon(Beverage beverage){
        this.beverage=beverage;
    }
    public double getCost(){
        double price=5.0;
        price+= beverage.getCost();
        System.out.println("Extra sugar");
        return price;
    }
}

