import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Book[] books = new Book[10];

    public static void main(String[] args) {

        books[0] = new ProgrammingBook("A1", "Java 1", 96, "Hieu 1", "JavaScript", "Fron-end 1");
        books[1] = new ProgrammingBook("A2", "Java 2", 82, "Hieu 2", "Python", "Fron-end 2");
        books[2] = new ProgrammingBook("A3", "Java 3", 321, "Hieu 3", "Java", "Fron-end 3");
        books[3] = new ProgrammingBook("A4", "Java 4", 623, "Hieu 4", "Java", "Fron-end 4");
        books[4] = new ProgrammingBook("A5", "Java 5", 158, "Hieu 5", "C/C++", "Fron-end 5");

        books[5] = new FictionBook("B1", "Java 6", 107, "Hieu 6", "Code learning 1");
        books[6] = new FictionBook("B2", "Java 7", 114, "Hieu 7", "Code learning 2");
        books[7] = new FictionBook("B3", "Java 8", 13, "Hieu 8", "Code learning 3");
        books[8] = new FictionBook("B4", "Java 9", 188, "Hieu 9", "Code learning 4");
        books[9] = new FictionBook("B5", "Java 10", 143, "Hieu 10", "Code learning 5");

//Tính tổng tiền 10 cuốn sách
        double total = 0;
        for (int i = 0; i < books.length; i++) {
            total += books[i].getPrice();
        }
        System.out.println("Price of 10 books: " + total);

//Đếm số sách ProgrammingBook có language là "Java"
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgrammingBook) {
                if (((ProgrammingBook) books[i]).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        System.out.println("There is " + count + " books has name is 'Java' ");

//        for (Book book : books){
//            if(book instanceof ProgrammingBook){
//                if (((ProgrammingBook) book).getLanguage().equals("Java")){
//                    count++;
//                };
//            }
//        } System.out.println(count);

//Sắp xếp thep thứ tự giá tiền
        System.out.println("Before sorting");
        displayBooks();
        System.out.println("After sorting");
        sortBook();
        displayBooks();
    }

    //Hàm hiển thị
    public static void displayBooks(){
        for (Book book: books){
            System.out.println(book);
        }
    }

    //Hàm sắp xếp
    public static void sortBook(){
        for (int i = 0; i < books.length; i++) {
            for (int j = i + 1; j < books.length; j++) {
                Book temp;
                if (books[i].getPrice() > books[j].getPrice()) {
                    temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
}
