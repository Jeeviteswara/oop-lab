class Person {
String name;
int age;
void displayInfo() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}
class Student extends Person {
String studentId;
void displayStudentInfo() {
displayInfo();
System.out.println("Student ID: " + studentId);
}
}
class GraduateStudent extends Student {
String thesisTitle;
void displayGraduateInfo() {
displayStudentInfo();
System.out.println("Thesis Title: " + thesisTitle);
}
}
public class Main5a {
public static void main(String[] args) {
GraduateStudent gradStudent = new GraduateStudent();
gradStudent.name = "Bob";
gradStudent.age = 24;
gradStudent.studentId = "S-12345";
gradStudent.thesisTitle = "AI in Healthcare";
gradStudent.displayGraduateInfo();
}
}
