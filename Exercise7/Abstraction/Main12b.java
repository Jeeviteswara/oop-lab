interface canFly{ 
public void fly(); 
} 
interface canSwim{ 
public void swim(); 
} 
interface canWalk{ 
public void walk(); 
} 
class cat implements canFly, canSwim, canWalk{ 
public void fly(){ 
System.out.println("cat cannot fly"); 
} 
public void swim(){ 
System.out.println("cat cannot swim"); 
} 
public void walk(){ 
System.out.println("cat can walk"); 
} 
} 
public class Main12b { 
public static void main(String[] args){ 
cat c = new cat(); 
c.fly(); 
c.swim(); 
c.walk(); 
} 
}