import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class OnlineStore {
    protected Mediator mediator;

    public OnlineStore(Mediator mediator){
        this.mediator=mediator;
    }

    public final void purchase() {
        Login();


        Integer index=0;

        String checkout="";

        System.out.println("Add to cart: ");


        while(true) {
            displayProduct();
            checkout = userInput("Enter a number or type 'checkout' to exit: ");

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

        index=Integer.parseInt(userInput("Select strategy")) ;
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

    protected abstract void Login();
    protected abstract void addProductToCart(Integer index);

    protected abstract void processPayment(PaymentStrategy paymentMethod);

    protected void sendConfirmationEmail(Product product, User user) {
        System.out.println("Sending confirmation email to " + user.getEmail() + " for " + product.getName());
    }

    public String userInput(String prompt){
        Scanner scanner=new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
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
            System.out.println(i+".Displaying product: " + product.getName() + " - " + product.getDescription() + " - $" + product.getPrice() +" Stock:"+ product.getInventory());
            i++;
        }
    }

    public void Login(){

        String name;
        String password;



        name=userInput("name");

        password=userInput("password");


        if(mediator.getUserList().isEmpty()) {
           addNewUser(name, password);
        } else {
            boolean userFound = false;
            for(User checkUser : mediator.getUserList()) {
                if(checkUser.getName().equals(name) && checkUser.getPassword().equals(password)) {
                    System.out.println("User logged in: " + checkUser.getName());
                    userFound = true;
                    break;
                }
            }
            if(!userFound) {
                System.out.println("Creating user account " );
                addNewUser(name, password);
            }
        }

    }

    public void addNewUser(String name, String password){
        System.out.println("Creating user account ");

        String email=userInput("email");
        String address=userInput("address");

        mediator.addUser(new User(name, email,password, address));
    }

    @Override
    public String userInput(String prompt){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter " + prompt);
        return scanner.nextLine();
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