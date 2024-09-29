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
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();
bankA.getBalance();
bankB.getBalance();
bankC.getBalance();
    }
}
