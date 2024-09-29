import java.util.*;
abstract class Bank {
    abstract void  getBalance();
}
class BankA extends Bank {
    double balance = 120000.0; 
    void getBalance() {
        System.out.println(balance);
    }
}
class BankB extends Bank {
   double balance = 150000.0; 
    void getBalance() {
        System.out.println(balance);
    }
    }
class BankC extends Bank {
     double balance = 200000.0;
    void getBalance() {
        System.out.println(balance);
    }
}
class  Exp9{
    public static void main(String[] args) {
        Bank a = new BankA();
        Bank b = new BankB();
        Bank c = new BankC();
a.getBalance();
b.getBalance();
c.getBalance();
    }
}
