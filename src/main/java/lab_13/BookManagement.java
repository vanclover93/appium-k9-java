package lab_13;

import java.util.List;
import java.util.Scanner;

public class BookManagement {

    public static void main(String[] args) {
        String relativeFilePath = "/src/lab_13/BookList.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);

        System.out.println("====Book Managemnet Program ====");
        System.out.println("1. Add new book");
        System.out.println("2. Find a book");
        System.out.println("3. Updtae a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your option: ");
        int option = scanner.nextInt();

        List<Book> bookList = BookData.getBookList(absoluteFilePath);


        switch (option) {
            case 1:
                System.out.println("The old book list is: " + bookList);

                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please input ISBN: ");
                int bookIsbn = scanner1.nextInt();
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Please input title: ");
                String bookTitle = scanner2.nextLine();
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Please input title: ");
                String bookAuthor = scanner3.nextLine();
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("Please input year: ");
                int bookYear = scanner4.nextInt();
                Book bookNew = new Book(bookIsbn, bookTitle, bookAuthor, bookYear);
                bookList.add(bookNew);
                System.out.println("The new book list is: " + bookList);
                break;

   /*         case 2:
                System.out.println("List is" + bookList);
                break;

          case 3:
                int max = bookList.get(0);
                for (int index = 0; index < bookList.size(); index++) {
                    if(bookList.get(index) > max){
                        max = bookList.get(index);
                    }
                }
                System.out.printf("Maximum number is: %d", max);
                break;

            case 4:
                int min = bookList.get(0);
                for (int index = 0; index < bookList.size(); index++) {
                    if(bookList.get(index) < min){
                        min = bookList.get(index);
                    }
                }
                System.out.printf("Minimum number is: %d", min);
                break;
            default:
                System.out.println("Invalid option");*/
        }
    }
}

