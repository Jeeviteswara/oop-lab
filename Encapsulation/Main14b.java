class Car {   
private String model;   
private int speed;   
public void setModel(String model) {   
this.model = model;   
}   
public String getModel() {   
return model;   
}   
public void setSpeed(int speed) {   
if (speed >= 0) {   
this.speed = speed;   
} else {   
System.out.println("Speed cannot be negative");   
}   
}   
public int getSpeed() {   
return speed;   
}   
}   
public class Main14b {   
public static void main(String[] args) {   
Car myCar = new Car();   
myCar.setModel("Audi");   
myCar.setSpeed(100);   
System.out.println("Car Model: " + myCar.getModel());   
System.out.println("Current Speed: " + myCar.getSpeed() + "km/h");   
}   
}  