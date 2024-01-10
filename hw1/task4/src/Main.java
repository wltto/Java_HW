import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер года");
        int year = scanner.nextInt();
        if (year<0) {
            System.out.println("Некорректное значение!");
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("В году 366 дней");
        }
        else {
            System.out.println("В году 365 дней");
        }
    }
}