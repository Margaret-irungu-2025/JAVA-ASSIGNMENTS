//NAME:MARGARET NJERI IRUNGU
//REGISTRATION NUMBER:S10-6336-2020
/*java code that defines student class with attributes name and marks, 
*/ 
import java.util.Scanner;
//student class
class Student{
    private String name;
    private double marks;
    public Student(String name, double marks) {
    }
    //constructor 
    public void Student (String name,double marks){
        this.name = name;
        this.marks = marks;
    }
    // method to print student details
    public void displayDetails(String grade){
        System.out.println("Student Name: " + name);
        System.out.println("Marks:" + marks);
        System.out.println("Grade:" + grade);
    }
    //getter for marks
    public double getMarks(){
        return marks;
    }
    //GradeCaclucator class
    class GradeCalculator {
        //method to calculate grade
        public String calculateGrade(double marks){
            if(marks>=90){
                return "A";
            }
            else if(marks>=75 && marks<90){
                return"B";
            }
                else if(marks>=75 && marks< 90){
                return "B";           
        }
                else if(marks>=50 && marks<75){
                return "C";

    }
                else{
                    return "D";
                }
}
                   // MainApp class
                   public class MainApp{
                   public static void main (String[] args){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter student name: ");
                    String name= scanner.nextLine();
                    System.out.println("Enter student marks: ");
                    double marks =scanner.nextDouble();
                    Student student =new Student (name, marks);
                    GradeCalculator calculator = new GradeCalculator();
                    String grade= calculator.calculateGrade(student.getMarks());
                    student.displayDetails(grade);
                    scanner.close();
                   }
                }
            }
        }
    
