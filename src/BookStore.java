import java.util.List;

public class BookStore {
    public Book[] booksList = new Book[100];


    public void addNewBook(Book[] books, Book book)
    {
        if (checkBook(books, book)) {
            printBook(book, 0);
            System.out.println("\nУже существует в картотеке");
        }
        else
        {
            for (int i =0; i< books.length; i++)
            {
                if (books[i] == null) {
                    books[i] = book;
                    printBook(book, i);
                    System.out.println("\nКнига успешно добавлена");
                    return;
                }
                if (i == books.length-1)
                    System.out.println("Картотека переполнена");

            }
        }
    }

    public void outBooksInfo(Book[] books)
    {
        System.out.println("\n\nВсе книги:");
        for (int i=0; i<books.length; i++)
        {
            Book book = books[i];
            if (book!=null)
            {
                printBook(book, i);
                System.out.println("\n");
            }
        }
    }

    public void printBook(Book book, int i)
    {
        System.out.printf("книга №%d: название: %s, год издания: %dг., цена - %dusd", i+1, book.bookName, book.bookDate, book.bookPrice);
    }

    public boolean checkBook(Book[] books, Book book)
    {
        for (int i=0; i< books.length; i++)
        {
            if ( (books[i] != null) && ((books[i].bookName.equals(book.bookName))   &&  (books[i].bookDate == book.bookDate)) )
            {
                return true;
            }
        }
        return false;

    }
}
