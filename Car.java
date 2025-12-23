/*NAME:MARGARET NJERI IRUNGU
REGISTRATION NUMBER:S10-6336-2020
write a java code that creates a car object,assign values to all attributes(brand,year and seats)
Prnit all the details using the printDetails method */
class Vehicle{
    String brand;
    int year;
    //constructor for vehicle
    Vehicle(String brand, int year){
        this.brand=brand;
        this.year=year;
    }
    //method that prints vehicle details
    void printVehicleDetails() {
        System.out.println("Brand:" + brand);
        System.out.println("Year:" + year);

    }
}
class Car extends Vehicle{
    int seats;
    //constructor for car
    Car (String brand, int year, int seats){
        super(brand, year);
        this.seats= seats;
    }
    //method to print all detils for car
    void printDetails(){
        printVehicleDetails();
        System.out.println("Seats:" + seats);
    }
}
public class Car{
    public static void main(String[] args){
        Car myCar = new Car("Toyota", 2020, 5);
        //print all the details
        myCar.printDetails();
    }

}
