import java.util.ArrayList;
import java.util.List;

public class Reader {

    public String fullName;
    public int numberTicket;
    public String faculty;
    public String dateBirthday;
    public String numberPhone;
    public List<Book> books = new ArrayList<>();


    public Reader(String fullName, int numberTicket, String faculty, String dateBirthday, String numberPhone) {
        this.fullName = fullName;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.dateBirthday = dateBirthday;
        this.numberPhone = numberPhone;

    }

    public void takeBook(Book book) {
        if (books.size() < 10){
            books.add(book);
            System.out.println(this.fullName + " взял книгу " + book.getNameBook());
        }
    }


    public void printStatus() {
        System.out.println(this.fullName + " взял " + books.size() + " книг: ");
        for (Book b :books) {
            System.out.println(b.getNameBook());
        }
    }

    public void returnBook(String nameBook) {
        boolean flag = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getNameBook().equals(nameBook)) {
                books.remove(i);
                flag = true;
            }
        }
        if (flag) {
            System.out.println(fullName + " вернул книгу " + nameBook);

        } else {
            System.out.println(fullName + " не хранит книгу " + nameBook);

        }
    }
}