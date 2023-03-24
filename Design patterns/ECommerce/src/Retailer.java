import java.util.ArrayList;

public class Retailer {

    private Mediator mediator;
    public Retailer(){
        Product product1=new Product("Lux", "Soap",100.0,20);
        Product product2=new Product("Clear","Shampoo",150.0,5);
        Product product3=new Product("Potato Cracker","Chips",10.0,100);
        Mediator mediator=new ConcreteMediator();
        mediator.addProduct(product1);
        mediator.addProduct(product2);
        mediator.addProduct(product3);
        this.mediator=mediator;
    }
    public Mediator getMediator(){
        return this.mediator;
    }
}

