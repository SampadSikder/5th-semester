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
            onlineStore.purchase();
        }


    }
}