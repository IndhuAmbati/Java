import java.util.*;
class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    Invoice(String no, String des, int qua, double price) {
        this.partNumber = no;
        this.partDescription = des;
        this.quantity = qua;
        this.pricePerItem = price;
    }

     void getInvoiceAmount() {
        System.out.println("Invoice Amount:  "+(quantity * pricePerItem));
    }
}
 class Exp1 {
    public static void main(String[] args) {
        Invoice i = new Invoice("123", "Hammer", 5, 12.99);
        i.getInvoiceAmount();
        
       
    }
}
