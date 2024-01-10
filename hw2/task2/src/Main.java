import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int minValue;
        int maxValue;

        do {
            System.out.println("Введите размер массива > 0");
            n = sc.nextInt();
        }while (n < 1);

        int[] mass = new int[n];

        do {
            System.out.println("Введите верхний предел значений массива");
            maxValue = sc.nextInt();
        }while (maxValue < 1);

        do {
            System.out.println("Введите нижний предел значений массива");
            minValue = sc.nextInt();
        }while (minValue > maxValue);

        Random rnd = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(maxValue + 1 - minValue) + minValue;
            System.out.print(mass[i] + " ");
        }
    }
}