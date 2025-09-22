// Program to compute discount
//Name:MARGARET NJERI IRUNGU
//REG NO:S10-6336-2020
import java.util.Scanner;
public class Discount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount;
        //prompt user to enter amount 
        System.out.println("Enter the amount purchased: ");
        double amount = scanner.nextDouble() ;   //nextInt, nextLine, nextFloat


        if ( amount > 5000){
            discount=amount * 0.1 ;
        }
        else if (amount >1000 && amount <= 5000){
            discount =amount * 0.05 ;
        }
        else{
            discount =0;
        }
    
        double amountToPay   = amount -discount;
        System.out.println( "initial amount " + amount);
        System.out.println( "Discount " + discount);
        System.out.println( "Amount to Pay " + amountToPay);


    }
}
