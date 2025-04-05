class Animal {
void eat() {
System.out.println("Animal is eating");
}
}
class Dog extends Animal {
void bark() {
System.out.println("Dog is barking");
}
}
class Cat extends Animal {
void meow() {
System.out.println("Cat is meowing");
}
}
class HybridAnimal extends Dog {
Cat catBehavior = new Cat();
void meow() {
catBehavior.meow();
}
}
public class Main7b {
public static void main(String[] args) {
HybridAnimal hybridAnimal = new HybridAnimal();
hybridAnimal.eat();
hybridAnimal.bark();
hybridAnimal.meow();
}
} 
