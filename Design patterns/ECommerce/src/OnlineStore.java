import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class OnlineStore {
    protected Mediator mediator;

    public OnlineStore(Mediator mediator){
        this.mediator=mediator;
    }

    public final void purchase() {

        String name;
        String password;
        String email;
        String address;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter name: ");
        name=scanner.nextLine();

        System.out.println("Enter email: ");
        email=scanner.nextLine();

        System.out.println("Enter password: ");
        password=scanner.nextLine();

        System.out.println("Enter address: ");
        address=scanner.nextLine();

        User user = new User(name,email,password,address);

        Login(user);
        displayProduct();


        Integer index=0;

        String checkout="";

        System.out.println("Add to cart: ");


        while(true) {
            System.out.print("Enter a number or type 'checkout' to exit: ");
            checkout = scanner.nextLine();

            if(checkout.equalsIgnoreCase("checkout")) {
                break;
            }
            try {
                int number = Integer.parseInt(checkout);
                addProductToCart(number-1);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'checkout'.");
            }
        }
        System.out.println("Enter payment method: ");

        System.out.println("1. Credit Card/t 2. Paypal 3. Cryptocurrency");

        index=scanner.nextInt();
        PaymentStrategy paymentStrategy=null;

        if(index==1){
            paymentStrategy=new CreditCardPayment().factoryMethod();
        }
        else if(index==2){
            paymentStrategy=new PaypalPayment().factoryMethod();
        }
        else if(index==3){
            paymentStrategy=new CryptoPayment().factoryMethod();
        }
        System.out.println("Confirming payment");

        processPayment(paymentStrategy);

        System.out.println("Thank you for using the system!");
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