class Animal {   
private String name;   
private int age;   
public void setName(String name) {   
this.name = name;   
}   
public String getName() {   
return name;   
}   
public void setAge(int age) {   
if (age > 0) {   
this.age = age;   
} else {   
System.out.println("Age must be positive!");   
}   
}   
public int getAge() {   
return age;   
}   
} 
public class Main14c {   
public static void main(String[] args) {   
Animal myAnimal = new Animal();   
myAnimal.setName("Tiger");   
myAnimal.setAge(5);   
System.out.println("Animal Name: " + myAnimal.getName());   
System.out.println("Animal Age: " + myAnimal.getAge() + " years");   
}   
}   