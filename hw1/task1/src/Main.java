import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n");
        double n = scanner.nextDouble();
        if (n % 2 == 0) {
            System.out.print("Число является четным");
        }
                else  {
                    System.out.print("Число является нечетным");
        }

    }
}