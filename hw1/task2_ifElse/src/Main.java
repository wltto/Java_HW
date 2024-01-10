import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7\n");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.print("Понедельник");
        }
           else if (n == 2) {
               System.out.print("Вторник");
        }
           else if (n == 3) {
            System.out.print("Среда");
        }
        else if (n == 4) {
            System.out.print("Четверг");
        }
        else if (n == 5) {
            System.out.print("Пятница");
        }
        else if (n == 6) {
            System.out.print("Суббота");
        }
        else if (n == 7) {
            System.out.print("Воскресенье");
        }
        else {
            System.out.print("Такого дня в неделе не существует");
        }
    }
}