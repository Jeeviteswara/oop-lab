class Product {
String productName;
double price;
void displayProductInfo() {
System.out.println("Product Name: " + productName);
System.out.println("Price: $" + price);
}
}
class Electronics extends Product {
String brand;
 void displayProductInfo() {
 super.displayProductInfo(); // Call to superclass method
 System.out.println("Brand: " + brand);
}
}
public class Main4b {
public static void main(String[] args) {
Electronics laptop = new Electronics();
laptop.productName = "Laptop";
laptop.price = 999.98;
laptop.brand = "Dell";
laptop.displayProductInfo();
}
}
