import java.util.*;
class ElectricityBill {
    int consumerNo;
    String consumerName;
    double previousReading;
    double currentReading;
    String connectionType;

    void details() {
        Scanner sc = new Scanner(System.in);
        consumerNo = sc.nextInt();
        consumerName = sc.next();
        previousReading = sc.nextDouble();
        currentReading = sc.nextDouble();
        connectionType = sc.next();
    }
    void calculateBill() {
        double units = currentReading - previousReading;
        double rate;
        if (connectionType.equalsIgnoreCase("domestic")) {
            if (units <= 100) {
                rate = 0.50;
            } else if (units > 100 && units <= 200) {
                rate = 1.00;
            } else if (units > 200 && units <= 350) {
                rate = 1.50;
            } else {
                rate = 2.50;
            }
        } else {
            if (units <= 100) {
                rate = 1.00;
            } else if (units > 100 && units <= 200) {
                rate = 2.00;
            } else {
                rate = 3.50;
            }
        }
        System.out.println(units * rate);
    }
public static void main(String[] args) {
        ElectricityBill b = new ElectricityBill();
        b.details();
        b.calculateBill();
    }
}
}
