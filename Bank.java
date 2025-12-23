/*NAME:MARGARET NJERI IRUNGU
REGISTRATION NUMBER:S10-6336-2020
Task:write a java code that creates a Savings Account object,depositd
amount entered byu the user,applis interest
and isplays final balance */
import java.util.Scanner;
class BankAccount{
    protected double balance;
    public BankAccount() {
        this.balance= 0;
    }
    public void deposit(double amount){
        balance+= amount;
    }
    public double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    public void addInterest(){
        balance*= 1.05;//increase balance by 5%
    }
}
public class Bank{
    public static void main(String[] args){
        SavingsAccount savingsAccount =new SavingsAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount=scanner.nextDouble();
        savingsAccount.deposit(amount);
        savingsAccount.addInterest();
        System.out.println("Final balance:"+ savingsAccount.getBalance());
        scanner.close();
}
}