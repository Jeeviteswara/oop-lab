class Printer {
void print(int number) {
System.out.println("Printing integer: " + number);
}
void print(double number) {
System.out.println("Printing double: " + number);
}
void print(String text) {
System.out.println("Printing string: " + text);
}
void print(int[] numbers) {
System.out.print("Printing integers: ");
for (int number : numbers) {
System.out.print(number + " ");
}
System.out.println();
}
}
public class Main10b {
public static void main(String[] args) {
Printer printer = new Printer();
printer.print(10);
printer.print(15.5);
printer.print("Hello, World!");
printer.print(new int[]{1, 2, 3, 4, 5});
}
}
