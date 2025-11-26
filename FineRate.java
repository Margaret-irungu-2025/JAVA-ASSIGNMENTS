//NAME:MARGARET NJERI IRUNGU
//REGISTRATION NUMBER:S10-6336-2020
//Java program to calculate fine rate for overdue days

import java.util.Scanner;
public class FineRate{
    public static void main(String[] args){
        Scanner scanner =new Scanner (System.in);
        //prompts user to enter book id.due date and return date
        System.out.println("Enter book ID");
        int bookID =scanner.nextInt();
        System.out.println("Enter Due date");
        int duedate=scanner.nextInt();
        System.out.println("Enter return date");
        int returndate=scanner.nextInt();
        int overdue=returndate-duedate;
        System.out.println("overdue days are:" +overdue);
        int fineAmount=scanner.nextInt();
    
         int fineRate;
         fineAmount=overdue* fineRate;
        System.out.println("Your fine amount is:" + fineAmount + "kshs");
        //To calculate FineRate
    
        if(overdue<=7){
    
            fineAmount=20*overdue;
        

        }
        if(overdue <=14){
        
            fineAmount=50*overdue;
        }
        else{
        
            fineAmount=100*overdue;
        }
    
    }

}
