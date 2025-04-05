interface Car{ 
public void start(); 
public void lightsOn(); 
public void lightsOff(); 
} 
class audi implements Car{ 
public void start(){ 
System.out.println("The audi is starting"); 
} 
public void lightsOn(){ 
System.out.println("The audi's lights are turned on"); 
} 
public void lightsOff(){ 
System.out.println("The audi's lights are turned off"); 
} 
} 
public class Main12a { 
public static void main(String[] args){ 
audi a = new audi(); 
a.start(); 
a.lightsOn(); 
a.lightsOff(); 
} 
}