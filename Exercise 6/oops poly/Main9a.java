class Shape{  
double area;  
Shape(double radius){  
area=Math.PI*radius*radius;  
System.out.println("Area: "+area);  
}  
Shape(double length,double width){  
area=length*width;  
System.out.println("Area: "+area);  
}   
}  
public class Main9a {
public static void main(String[] args){    
Shape circle=new Shape(5);  
Shape rectangle=new Shape(4,6);    
}  
}  


