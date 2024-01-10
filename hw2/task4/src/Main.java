import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        int[] mass = new int[n];

        System.out.println("Введите верхний предел значений массива");
        int maxValue = sc.nextInt();

        System.out.println("Введите нижний предел значений массива");
        int minValue = sc.nextInt();

        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(maxValue + 1 - minValue) + minValue;
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mass.length-1; i++) {
            for (int j = 0; j < mass.length - i - 1; j++) {
                if (mass[j+1] < mass[j]){
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Сортировка пузырьком:");
        for (int elem: mass) {
            System.out.print(elem + " ");
        }
    }
}