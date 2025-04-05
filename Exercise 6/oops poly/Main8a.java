class Animal {
String name;
Animal(String name) {
this.name = name;
}
void sound() {
System.out.println(name + " makes a sound.");
}
}
class Dog extends Animal {
Dog(String name) {
super(name);
}
void sound() {
System.out.println(name + " barks.");
}
}
class Cat extends Animal {
Cat(String name) {
super(name);
}
void sound() {
System.out.println(name + " meows.");
}
}
public class Main8a {
public static void main(String[] args) {
Animal myDog = new Dog("Dog");
Animal myCat = new Cat("Cat");
myDog.sound();
myCat.sound();
}
}

