class Vehicle {
String brand;
int year;
void displayInfo() {
System.out.println("Brand: " + brand);
System.out.println("Year: " + year);
}
}
class Car extends Vehicle {
int numberOfDoors;
void displayCarInfo() {
displayInfo();
System.out.println("Number of Doors: " + numberOfDoors);
}
}
class Truck extends Vehicle {
double loadCapacity;
void displayTruckInfo() {
displayInfo();
System.out.println("Load Capacity: " + loadCapacity + " tons");
}
}
class Motorcycle extends Vehicle {
boolean hasSidecar;
void displayMotorcycleInfo() {
displayInfo();
System.out.println("Has Sidecar: " + hasSidecar);
}
}
public class Main6b2 {
public static void main(String[] args) {
Car car = new Car();
car.brand = "Toyota";
car.year = 2021;
car.numberOfDoors = 4;
car.displayCarInfo();
Truck truck = new Truck();
truck.brand = "Ford";
truck.year = 2020;
truck.loadCapacity = 10.5;
truck.displayTruckInfo();
Motorcycle motorcycle = new Motorcycle();
motorcycle.brand = "Harley-Davidson";
motorcycle.year = 2019;
motorcycle.hasSidecar = false;
motorcycle.displayMotorcycleInfo();
}
}
