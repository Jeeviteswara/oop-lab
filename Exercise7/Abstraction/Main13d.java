abstract class Television {   
String brand;   
Television(String brand) {   
this.brand = brand;   
}   
abstract void turnOn();   
abstract void turnOff();   
}   
class SonyTV extends Television {   
SonyTV() {   
super("Sony");   
}   
void turnOn() {   
System.out.println(brand + " TV is now ON");   
}   
void turnOff() {   
System.out.println(brand + " TV is now OFF");   
}   
}   
class SamsungTV extends Television {   
SamsungTV() {   
super("Samsung");   
}   
void turnOn() {   
System.out.println(brand + " TV is now ON");   
}   
void turnOff() {   
System.out.println(brand + " TV is now OFF");   
}   
}   
public class Main13d {   
public static void main(String[] args) {   
Television sony = new SonyTV();   
Television samsung = new SamsungTV();   
sony.turnOn();   
sony.turnOff();   
samsung.turnOn();   
samsung.turnOff();   
}   
}  