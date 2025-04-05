class LibraryItem {
    String title;
    String publisher;
   void displayInfo() {
   System.out.println("Title: " + title);
   System.out.println("Publisher: " + publisher);
}
}
class Book extends LibraryItem {
String author;
void displayInfo() {
 super.displayInfo(); 
 System.out.println("Author: " + author);
}
}

public class Main4a {
public static void main(String[] args) {
Book book = new Book();
book.title = "Java Basics";
book.publisher = "robert";
book.author = "Joshua";
book.displayInfo();
}
}
