abstract class car{ 
public abstract void start(); 
public void lightsOn(){ 
System.out.println("The lights are on"); 
} 
} 
class audi extends car{ 
public void start(){ 
System.out.println("The car(audi) is staring"); 
} 
} 
public class Main13a { 
public static void main(String[] args){ 
audi a = new audi(); 
a.start(); 
a.lightsOn(); 
} 
}