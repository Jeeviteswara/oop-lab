class LibraryItem {
String title;
String author;
void displayItemInfo() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
}
}
class Book extends LibraryItem {
int pages; 
void displayBookInfo() {
displayItemInfo();
System.out.println("Pages: " + pages);
}
}
class EBook extends Book {
double fileSize;
void displayEBookInfo() {
displayBookInfo();
System.out.println("File Size: " + fileSize + " MB");
}
}
public class Main5b {
public static void main(String[] args) {
EBook eBook = new EBook();
eBook.title = "Java Programming";
eBook.author = "John Doe";
eBook.pages = 300;
eBook.fileSize = 1.5;
eBook.displayEBookInfo();
}
}
