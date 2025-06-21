public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author gogol = new Author("Николай", "Гоголь");

        Book book1 = new Book("Медный всадник", pushkin, 1833);
        Book book2 = new Book("Мертвые души", gogol, 1842);
        Book book3 = new Book("Медный всадник", new Author("Александр", "Пушкин"), 1833);

        System.out.println("Книга 1: " + book1);
        System.out.println("Книга 2: " + book2);

        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book1.equals(book3): " + book1.equals(book3));

        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());
    }
}
