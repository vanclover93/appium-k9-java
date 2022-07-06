package lab_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookData {
    public static List<Book> getBookList(String filePath){
        System.out.println("[INFO] Reading from file ".concat(filePath));
        List<Book> bookList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ){
            String dataLine = bufferedReader.readLine();
            while (dataLine != null){
                String[] bookData = dataLine.split(";");
                int bookIsbn = Integer.parseInt(bookData[0]);
                String bookTitle = bookData[1];
                String bookAuthor = bookData[2];
                int bookYear = Integer.parseInt(bookData[3]);

                Book book = new Book(bookIsbn, bookTitle, bookAuthor, bookYear);
                bookList.add(book);
                dataLine = bufferedReader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("[ERROR] File not found!");
        }catch (IOException e){
            e.printStackTrace();
        }
        return bookList;
    }
}

