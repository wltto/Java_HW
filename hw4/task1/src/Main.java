import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int action;
        Reader[] readers = new Reader[10];


        do {
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читататель хочет взять книгу");
            System.out.println("3 -- Читататель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статус всех читателей");
            System.out.println("6 -- Выйти из программы");
            System.out.println("Введите номер действия");
            action = scan.nextInt();

            switch (action) {
                case (1): {
                    boolean isFull = true;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] == null) {
                            System.out.println("Введите ФИО");
                            scan.nextLine();
                            String fullName = scan.nextLine();
                            System.out.println("Введите номер читательского билета");
                            int numberTicket = scan.nextInt();
                            System.out.println("Введите факультет");
                            scan.nextLine();
                            String faculty = scan.nextLine();
                            System.out.println("Введите дату рождения");
                            String dateBirthday = scan.nextLine();
                            System.out.println("Введите номер телефона");
                            String numberPhone = scan.nextLine();

                            readers[i] = new Reader(fullName, numberTicket, faculty, dateBirthday, numberPhone);

                            isFull = false;
                            break;
                        }
                    }

                    if (isFull) {
                        System.out.println("Книгу взять невозможно из-за максимального количества читателей");
                    }
                    break;
                }


                case (2): {
                    System.out.println("Введите название книги:");
                    scan.nextLine();
                    String nameBook = scan.nextLine();
                    System.out.println("Введите имя автора:");
                    String authorName = scan.nextLine();
                    System.out.println("Введите номер билета");
                    int number = scan.nextInt();

                    boolean found = false;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].numberTicket == number) {
                            readers[i].takeBook(new Book(nameBook, authorName));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }


                case (3): {
                    System.out.println("Введите название книги");
                    scan.nextLine();
                    String nameBook = scan.nextLine();
                    System.out.println("Введите номер билета");
                    int number = scan.nextInt();
                    boolean found = false;

                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].numberTicket == number) {
                            readers[i].returnBook(nameBook);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }


                case (4): {
                    System.out.println("Ввдите номер билета");
                    int number = scan.nextInt();
                    scan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].numberTicket == number) {
                            readers[i].printStatus();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }


                case (5): {
                    for (Reader r : readers) {
                        if (r != null) {
                            r.printStatus();
                        }
                    }
                }


                case (6): {
                    System.out.println("Завершение программы");
                    break;
                }


                default: {
                    System.out.println("Такой команды не существует");
                }
            }
        } while (action != 6);
    }
}