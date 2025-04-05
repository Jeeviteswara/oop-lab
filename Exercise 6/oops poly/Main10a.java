class MathOperations{  
void multiply(int a, int b){  
System.out.println("Product of two integers: "+(a*b));  
}  
void multiply(double a, double b){  
System.out.println("Product of two decimals: "+(a*b));  
}  
void multiply(int a, int b, int c){  
System.out.println("Product of three integers: "+(a*b*c));  
}  
}
public class Main10a {
public static void main(String[] args){  
MathOperations math=new MathOperations();  
math.multiply(5,10);  
math.multiply(4.5,2.2);  
math.multiply(2,3,4);  
}  
}  
