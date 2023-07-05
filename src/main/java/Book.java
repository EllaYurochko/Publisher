public class Book {
    // переменные author и publisher внутри класса
    private IAuthor author;
    private IPublisher publisher;

    // здесь допиши внедрение зависимости author и publisher через конструктор
    public Book(IAuthor author, IPublisher publisher) {
        this.author = author;
        this.publisher = publisher;
    }

    // методы из классов author и publisher
    public void printBookInfo() {
        System.out.println("Автор: " + author.getName());
        System.out.println("Год основания издательства: " + publisher.foundationYear());
    }
}
