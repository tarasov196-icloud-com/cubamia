
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Николай", "Гоголь");

        Book book1 = new Book("Медный всадник", author1, 1833);
        Book book2 = new Book("Мертвые души", author2, 1842);


        System.out.println("Книга 1: " + book1.getTitle() +
                ", автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                ", год: " + book1.getPublicationYear());

        System.out.println("Книга 2: " + book2.getTitle() +
                ", автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() +
                ", год: " + book2.getPublicationYear());

        book2.setPublicationYear(1843);
        System.out.println("Обновленный год публикации для книги 2: " + book2.getPublicationYear());
    }
}
