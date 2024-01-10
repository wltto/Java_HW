import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] mass = new int[n];

        System.out.println("Введите нижний предел массива");
        int lowerLimit = sc.nextInt();

        System.out.println("Введите верхний предел массива");
        int maxLimit = sc.nextInt();

        Random rnd = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(maxLimit + 1 - lowerLimit) + lowerLimit;
        }

        int maxValue = mass[0];
        int maxIndex = -1;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > maxValue){
                maxValue = mass[i];
                maxIndex = i;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println();


        System.out.println("Максимальное значение массива: " + maxValue);
        System.out.println("Индекс максимального значения: " + maxIndex);

    }
}