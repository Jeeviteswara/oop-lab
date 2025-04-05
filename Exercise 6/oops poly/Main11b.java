class BankAccount {
void accountType() {
System.out.println("This is a general bank account.");
}
}
class SavingsAccount extends BankAccount {
void accountType() {
System.out.println("This is a savings account.");
}
}
class CurrentAccount extends BankAccount {
void accountType() {
System.out.println("This is a current account.");
}
}
public class Main11b {
public static void main(String[] args) {
BankAccount myAccount = new BankAccount();
BankAccount mySavings = new SavingsAccount();
BankAccount myCurrent = new CurrentAccount();
myAccount.accountType();
mySavings.accountType();
myCurrent.accountType();
}
}
