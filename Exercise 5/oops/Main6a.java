class Shape {
String color;
void displayColor() {
System.out.println("Color: " + color);
}
}
class Circle extends Shape {
double radius;
void displayCircleInfo() {
displayColor();
System.out.println("Radius: " + radius);
}
}
class Rectangle extends Shape {
double length;
double width;
void displayRectangleInfo() {
displayColor();
System.out.println("Length: " + length);
System.out.println("Width: " + width);
}
}
class Triangle extends Shape {
double base;
double height;
void displayTriangleInfo() {
displayColor();
System.out.println("Base: " + base);
System.out.println("Height: " + height);
}
}
public class Main6a {
public static void main(String[] args) {
Circle circle = new Circle();
circle.color = "Red";
circle.radius = 5.0;
circle.displayCircleInfo();
Rectangle rectangle = new Rectangle();
rectangle.color = "Blue";
rectangle.length = 4.0;
rectangle.width = 6.0;
rectangle.displayRectangleInfo();
Triangle triangle = new Triangle();
triangle.color = "Green";
triangle.base = 3.0;
triangle.height = 4.0;
triangle.displayTriangleInfo();
}
}

