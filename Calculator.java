import java.util.*;  
class Calculator {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the first number: ");  
        double num1 = sc.nextDouble();  
        System.out.print("Enter the second number: ");  
        double num2 = sc.nextDouble();  
        
         System.out.print("Enter the operator (+, -, *, /,%): ");  
        char operator = sc.next().charAt(0);  
        double result;  

        try {  
            switch (operator) {  
                case '+':  
                    result = num1 + num2;  
                    System.out.println("Result: " + result);  
                    break;  
                case '-':  
                    result = num1 - num2;  
                    System.out.println("Result: " + result);  
                    break;  
                case '*':  
                    result = num1 * num2;  
                    System.out.println("Result: " + result);  
                    break;  
                case '/':  
                    if (num2 == 0) {  
                        System.out.println("Error: Division by zero");  
                    } else {  
                        result = num1 / num2;  
                        System.out.println("Result: " + result);  
                    }  
                    break;  
                case '%':  
                    result = num1 % num2;  
                    System.out.println("Result: " + result);  
                    break; 
                default:  
                    System.out.println("Error: Invalid operator");  
            }  
        } catch (ArithmeticException e) {  
            System.out.println("Error: Division by zero");  
        }  
    }  
}
