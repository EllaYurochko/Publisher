// класс Main, в котором создаются объекты для внедрения в класс Book
public class Main {
    public static void main(String[] args) {
        IAuthor author = new FantasyAuthor();
        IPublisher publisher = new OldPublisher();
        Book book = new Book(author, publisher);
        book.printBookInfo();
    }
}
