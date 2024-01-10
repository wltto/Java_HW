public class Reader {

    public String fullName;
    public int numberTicket;
    public String faculty;
    public String dateBirthday;
    public String numberPhone;
    public Book[] books = new Book[10];


    public Reader(String fullName, int numberTicket, String faculty, String dateBirthday, String numberPhone) {
        this.fullName = fullName;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.dateBirthday = dateBirthday;
        this.numberPhone = numberPhone;

    }

    public void takeBook(Book book) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println(this.fullName + " взял книгу " + book.getNameBook());
                break;
            }
        }
    }


    private int countElem() {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                count++;
            }
        }
        return count;
    }


    public void printStatus() {
        System.out.println(this.fullName + " взял " + countElem() + " книг: ");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getNameBook());
            }
        }
    }


    public void returnBook(String nameBook) {
        boolean flag = false;
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] != null && books[i].getNameBook().equals(nameBook)) {
                books[i] = null;
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