abstract class vehicle{ 
public abstract void start(); 
} 
abstract class car extends vehicle{ 
public abstract void lightsOn(); 
} 
class audi extends car{ 
public void start(){ 
System.out.println("The car(audi) is staring"); 
} 
public void lightsOn(){ 
System.out.println("The lights are on"); 
} 
} 
public class Main13b { 
public static void main(String[] args){ 
audi a = new audi(); 
a.start(); 
a.lightsOn(); 
} 
}