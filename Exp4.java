import java.util.*;
class Book {
    String bookName;
   String isbnNumber;
    String authorName;
    String publisher;
   void details (){
       Scanner sc=new Scanner(System.in);
        bookName=sc.next();
        isbnNumber=sc.next();
        authorName=sc.next();
        publisher=sc.next();
    }
    String getBookName() {
        return bookName;
    }
    void setBookName(String bookName) {
        this.bookName = bookName;
    }
     String getIsbnNumber() {
        return isbnNumber;
    }
    void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    } String getAuthorName() {
        return authorName;
    }
    void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
String getPublisher() {
        return publisher;
    }
    void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    void getBookInfo() {
        System.out.println("Book Name: " + bookName + "\n" +
                "ISBN: " + isbnNumber + "\n" +
                "Author: " + authorName + "\n" +
                "Publisher: " + publisher);
    }
}
class Exp4 {
    public static void main(String[] args) {
        Book b = new Book();
        b.details();
        b.getBookInfo();
    }
}
