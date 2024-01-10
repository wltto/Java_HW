import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите три числа\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число\n");
        int a = scanner.nextInt();
        System.out.print("Введите второе число\n");
        int b = scanner.nextInt();
        System.out.print("Введите третье число\n");
        int c = scanner.nextInt();

        if (a <= b && a <= c) {
            System.out.print(b + c - a);
        }
        if (b <= a && b <= c) {
            System.out.print(a + c - b);
        }
        if (c <= a && c <= b) {
            System.out.print(a + b - c);
        }
    }
}