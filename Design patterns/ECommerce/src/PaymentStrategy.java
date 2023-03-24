import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public interface PaymentStrategy {
    Scanner scanner=new Scanner(System.in);
    public void processPayment(Double price);
    public PaymentStrategy factoryMethod();
}

class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;
    private String cvv;
    private String expirationDate;
    private Double deductedAmount;

    public CreditCardPayment(){

    }
    public CreditCardPayment(String cardNumber, String cvv, String expirationDate){
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        this.expirationDate=expirationDate;
    }

    public void processPayment(Double amount){
        //check information
        deductedAmount=amount;
        //check balance
        System.out.println("Payment done using credit card, Amount deducted: "+deductedAmount);
    }
    public CreditCardPayment factoryMethod(){
        System.out.println("Enter card Number: ");
        cardNumber=scanner.nextLine();
        System.out.println("Enter cvv: ");
        cvv=scanner.nextLine();
        System.out.println("Enter expirationDate: ");
        expirationDate=scanner.nextLine();

        return new CreditCardPayment(cardNumber,cvv,expirationDate);
    }
}

class PaypalPayment implements PaymentStrategy{
    private String username;
    private String password;
    private Double deductedAmount;

    public PaypalPayment(){

    }
    public PaypalPayment(String username, String password){
        this.username=username;
        this.password=password;
    }
    public void processPayment(Double amount){
        //check information
        deductedAmount=amount/100;
        //check balance
        System.out.println("Payment done using paypal, Amount deducted: "+deductedAmount);
    }
    public PaypalPayment factoryMethod(){
        System.out.println("Enter username: ");
        username=scanner.nextLine();
        System.out.println("Enter password: ");
        password=scanner.nextLine();

        return new PaypalPayment(username,password);
    }
}

class CryptoPayment implements PaymentStrategy{
    private String walletNumber;
    private String transactionToken;
    private Double deductedAmount;

    public CryptoPayment(){

    }
    public CryptoPayment(String walletNumber, String transactionToken){
        this.walletNumber=walletNumber;
    }
    public void processPayment(Double amount){
        //check information

        deductedAmount=amount/2879900.18;

        //check balance

        System.out.println("Payment done using paypal, Amount deducted: "+deductedAmount);
    }
    public CryptoPayment factoryMethod(){
        System.out.println("Enter walletNumber: ");
        walletNumber=scanner.nextLine();
        System.out.println("Enter TxToken: ");
        transactionToken=scanner.nextLine();

        return new CryptoPayment(walletNumber,transactionToken);
    }
}