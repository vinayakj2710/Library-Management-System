
public abstract class Book implements Lendable {

    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book() {
        isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this();
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book(Book book) {
        this();
        this.isbn = book.isbn;
        this.title = book.title;
        this.author = book.author;
    }

    public abstract void displayBookDetails();

    @Override
    public boolean lend(User user) {
        if (isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnItem(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    //
    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
