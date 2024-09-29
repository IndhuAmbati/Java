import java.util.*;
class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;
    SavingsAccount(double initialBalance) {
        savingsBalance = initialBalance;
    }
    void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }
   static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
public void getSavingsBalance() {
        System.out.printf("Savings Balance: %.2f%n", savingsBalance);

    }
    public static void main(String s[]) {
        SavingsAccount.modifyInterestRate(0.04);
        SavingsAccount a = new SavingsAccount(1000.0);
        a.calculateMonthlyInterest();
         a.getSavingsBalance();
            }
}
