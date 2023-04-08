import javax.accessibility.AccessibleValue;
import java.util.ArrayList;

public interface Beverage {
    public void addon(Beverage beverage);
    public double getCost();
}

class Espresso implements Beverage{
    public void addon(Beverage beverage){

    }
    public double getCost(){
        return 10.0;
    }
}
class Mocha implements Beverage{
    public void addon(Beverage beverage){

    }
    public double getCost(){
        return 10.0;
    }
}

class Addon implements Beverage{
    private ArrayList<Beverage> addons=new ArrayList<>();

    public void addon(Beverage beverage){
        this.addons.add(beverage);
    }

    public double getCost(){
        double price=0;

        for(Beverage beverage:addons){
            price+= beverage.getCost();
        }
        return price;
    }
}

class MilkAddon implements Beverage{
    private ArrayList<Beverage> addons=new ArrayList<>();

    public void addon(Beverage beverage){
        this.addons.add(beverage);
    }

    public double getCost(){
        return 5.00;
    }
}
class SugarAddon implements Beverage{
    private ArrayList<Beverage> addons=new ArrayList<>();

    public void addon(Beverage beverage){
        this.addons.add(beverage);
    }

    public double getCost(){
        return 5.00;
    }
}
class ChocolateAddon implements Beverage{
    private ArrayList<Beverage> addons=new ArrayList<>();

    public void addon(Beverage beverage){
        this.addons.add(beverage);
    }

    public double getCost(){
        return 5.00;
    }
}
