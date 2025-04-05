class Shape {
void draw() {
System.out.println("Drawing a shape");
}
}
class Circle extends Shape {
void draw() {
System.out.println("Drawing a circle");
}
}
class Rectangle extends Shape {
void draw() {
System.out.println("Drawing a rectangle");
}
}
class ColoredCircle extends Circle {
Rectangle rectangleBehavior = new Rectangle();
void drawRectangle() {
rectangleBehavior.draw();
}
void draw() {
System.out.println("Drawing a colored circle");
}
}
public class Main7a {
public static void main(String[] args) {
ColoredCircle coloredCircle = new ColoredCircle();
coloredCircle.draw();
coloredCircle.drawRectangle();
}
}
