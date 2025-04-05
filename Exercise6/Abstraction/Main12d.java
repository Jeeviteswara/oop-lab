interface Payment {   
void processPayment(double amount);   
}   
class CreditCard implements Payment {   
public void processPayment(double amount) {   
System.out.println("$" + amount);   
}   
}   
class PhonePe implements Payment {   
public void processPayment(double amount) {   
System.out.println("$" + amount);   
}   
}   
public class Main12d {   
public static void main(String[] args) {   
Payment myCreditCard = new CreditCard();   
Payment myPhonePe = new PhonePe();   
myCreditCard.processPayment(100.00);   
myPhonePe.processPayment(50.00);   
}   
}  