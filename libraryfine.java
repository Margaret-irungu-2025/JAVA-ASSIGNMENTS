//program to compute fine rate of overdue  library books
// NAME :MARGARET NJERI IRUNGU
//REG NUMBER:S10-6336-2020
import java.util.Scanner;
public class libraryfine {
    public static void main (String[] args ){
    Scanner input = new Scanner (System.in);
    //input from student
    System.out.print ("Enter book ID: ");
    String bookID =input.nextLine();
    int dueDate =input.nextInt();
    System.out.print ("Enter Return Date : ");
    int returnDate =input.nextInt();
    //how to calculate overdue
    int daysOverdue =returnDate- dueDate;
    //Declare the fine variables 
    int fineRate;
    long fineAmount;
    //fine rate
    if (daysOverdue <=0){
        fineRate = 0;
        daysOverdue =0;
    }
    else if (daysOverdue <=7){
        fineRate=20;
     }
     else if (daysOverdue<=14){
        fineRate=50;
     }
     else {
        fineRate=100;
     }
     //Fine Amount calculation
     fineAmount=daysOverdue *fineRate;
     //display results
     System.out.println ("\n---Library Fine Details---");
     System.out.println("Book ID: " + bookID);
     System.out.println("Due Date: " + dueDate);
     System.out.println("Return Date: " + returnDate);
     System.out.println("Days overdue: " + daysOverdue);
     System.out.println("Fine Rate (daily): ksh. " + fineRate);
     System.out.println("Total Fine; ksh. " + fineAmount);
     input.close();
}
}

