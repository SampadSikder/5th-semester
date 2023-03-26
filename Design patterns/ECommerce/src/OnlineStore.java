import java.util.ArrayList;
import java.util.List;

public abstract class OnlineStore {
    protected Mediator mediator;

    public OnlineStore(Mediator mediator){
        this.mediator=mediator;
    }

    public void purchase(Product product, User user, PaymentStrategy paymentMethod, Double price) {
        displayProduct();
        Login(user);
        processPayment(paymentMethod);
        sendConfirmationEmail(product, user);
    }

    protected abstract void displayProduct();

    protected abstract void Login(User user);
    protected abstract void addProductToCart(Integer index);

    protected abstract void processPayment(PaymentStrategy paymentMethod);

    protected void sendConfirmationEmail(Product product, User user) {
        System.out.println("Sending confirmation email to " + user.getEmail() + " for " + product.getName());
    }
}

class ConcreteOnlineStore extends OnlineStore {
    public ConcreteOnlineStore(Mediator mediator){
        super(mediator);
    }

    @Override
    public void displayProduct() {
        Integer i=1;
        for(Product product: mediator.getProductList()){
            System.out.println(i+".Displaying product: " + product.getName() + " - " + product.getDescription() + " - $" + product.getPrice());
            i++;
        }
    }

    public void Login(User user){

        if(mediator.getUserList().isEmpty()) {
            System.out.println("Creating user account " + user.getName());
            mediator.addUser(user);
        } else {
            boolean userFound = false;
            for(User checkUser : mediator.getUserList()) {
                if(user.getName().equals(checkUser.getName()) && user.getPassword().equals(checkUser.getPassword())) {
                    System.out.println("User logged in: " + user.getName());
                    userFound = true;
                    break;
                }
            }
            if(!userFound) {
                System.out.println("Creating user account " + user.getName());
                mediator.addUser(user);
            }
        }
    }

    public void addProductToCart(Integer index){
        mediator.addToCart(mediator.getProductList().get(index));
        System.out.println("Cart is: ");
        for(Product product: mediator.getCart()){
            System.out.println("Added : " + product.getName() + " - " + product.getDescription() + " - $" + product.getPrice());
        }
    }
    public void createUserAccount(User user) {
        System.out.println("Creating user account for " + user.getName() + " with email " + user.getEmail());
    }

    @Override
    public void processPayment(PaymentStrategy paymentMethod) {
        if(mediator.getCart().isEmpty()){
            System.out.println("Cart is empty!");
            return;
        }
        mediator.setPaymentMethod(paymentMethod);
        System.out.println("Product bought with price: " + mediator.processOrder());
        paymentMethod.processPayment(mediator.processOrder());
        mediator.emptyCart();
    }
}