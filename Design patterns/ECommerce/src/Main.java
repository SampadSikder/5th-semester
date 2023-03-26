import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Retailer retailer=new Retailer();



        while(true){
            System.out.println("Login: ");
            OnlineStore onlineStore=new ConcreteOnlineStore(retailer.getMediator());
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

            onlineStore.Login(user);
            onlineStore.displayProduct();


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
                    onlineStore.addProductToCart(number-1);
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

            onlineStore.processPayment(paymentStrategy);

            System.out.println("Thank you for using the system!");
        }


    }
}