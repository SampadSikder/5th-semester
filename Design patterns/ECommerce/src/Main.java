import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Retailer retailer=new Retailer();
        System.out.println("Welcome!");
        OnlineStore onlineStore=new ConcreteOnlineStore(retailer.getMediator());


        while(true){
            onlineStore.purchase();
        }


    }
}