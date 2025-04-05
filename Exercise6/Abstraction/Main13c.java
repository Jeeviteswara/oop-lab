abstract class LibraryItem {   
String title;   
boolean isAvailable = true;   
LibraryItem(String title) {   
this.title = title;   
}   
abstract void checkOut();   
abstract void returnItem();   
}   
class Book extends LibraryItem {   
Book(String title) {   
super(title);   
}   
void checkOut() {   
if (isAvailable) {   
isAvailable = false;   
System.out.println(title + " has been checked out.");   
} else {   
System.out.println(title + " is already borrowed!");   
}   
}   
void returnItem() {   
isAvailable = true;   
System.out.println(title + " has been returned.");   
}   
}   
public class Main13c {   
public static void main(String[] args) {   
Book book1 = new Book("Java basics");   
Book book2 = new Book("Python basics");   
book1.checkOut();   
book1.checkOut();   
book2.returnItem();   
book2.checkOut();   
}   
}   