//NAME:MARGARET NJERI IRUNGU
//REGISTRATION NUMBER:S10-6336-2020
/*Required to write a java method named calculateTotalCost that takes three parameters ie,
 * doubleaccomodationCost,doublemealCost and double activityCost and returns the total cost.
 in the main method call this method with sample data and display the result.
 */

public class Travelcost{
    //method that returns the total cost
    public static double calculateTotalCost(double accomodationCost,double mealCost,double activityCost){
        return accomodationCost+mealCost+activityCost;
    }
    public static void main(String[] args){
        double total=calculateTotalCost(5000.00,2500.00,1500.00);
        //display result
        System.out.println("The Total travel Cost is:"  + total);
    }
}