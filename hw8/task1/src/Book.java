public class Book {

    private String nameBook;
    public String authorName;
    public String text = "Текст книги";

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Book(String nameBook, String authorName) {
        this.nameBook = nameBook;
        this.authorName = authorName;
    }

}