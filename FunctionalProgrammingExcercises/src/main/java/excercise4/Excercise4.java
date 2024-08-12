package excercise4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Excercise4 {
    public static void main(String[] args) {
        List<Book> booksList = getBooksSupplier().get();

        Predicate<Book> recommendedBook = x -> x.getScore() >= 7.0;

        UnaryOperator<String> message = x -> x + " is a recommended book";

        Consumer<Book> booksConsumer = book -> {
            if (recommendedBook.test(book)){
                System.out.println(message.apply(book.getName()));
            }
        };
        booksList.forEach(booksConsumer);

    }

    private static Supplier<List<Book>> getBooksSupplier() {
        Book book1 = new Book("A study in scarlet", "Sir Arthur Conan Doyle", 10.0);
        Book book2 = new Book("The Sign of the Four", "Sir Arthur Conan Doyle", 9.0);
        Book book3 = new Book("The Hound of the Baskervillesn", "Sir Arthur Conan Doyle", 9.5);
        Book book4 = new Book("The Valley of Fear", "Sir Arthur Conan Doyle", 6.5);
        return () -> Arrays.asList(book1, book2, book3, book4);
    }
}
