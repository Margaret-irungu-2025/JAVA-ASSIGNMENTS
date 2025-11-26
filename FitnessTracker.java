//NAME:MARGARET NJERI IRUNGU;
//REGISTRATION NUMBER:S10-6336-2020;
/*Required to write a java method named getFitnessLevel that takes an ineteger steps as input
 * and returns:excellent if steps>=1000,good if steps>=7000 and <10000,average if steps >=4000
 * and <7000 or poor otherwise.in the main method prompt the user to enter thier stepsfor the day
 *  and print fitness level returned by the method
 */

 import java.util.Scanner;
 public class FitnessTracker{
    //method that returns fitness level
    public static String getFitnesslevel(int steps){
        if(steps>=10000){
            return"EXcellent";
        }
        else if (steps >= 7000&&steps<10000){
            return "good";
        }
        else if(steps>= 4000&&steps<7000){
            return"Average";
        }
        else{
            return "Poor";
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your steps for today");
        int steps=scanner.nextInt();
        //call the method
        String level=getFitnesslevel(steps);
        System.out.println("Your fitness level is:" + level);
    }
 }