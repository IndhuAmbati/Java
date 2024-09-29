import java.util.*;
public class IntegerDivision {
    public static void main(String[] args) {
      int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
            num1 = sc.nextInt();
        System.out.print("Enter second number: ");
           num2 = sc.nextInt();
    try {
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
