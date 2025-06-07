package LAB12.task4;

public class Book extends LibraryItem implements Reservable {
    private String author;

    public Book(String title, String author, int year) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return "Book: " + title + " by " + author + " (" + year + ")";
    }

    @Override
    public void reserve() {
        System.out.println("Книга \"" + title + "\" зарезервована.");
    }
}
