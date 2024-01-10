import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99) + 10;
        }

        System.out.println("Массив:");
        for (int a : array) {
            System.out.println(a);
        }

        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {

            System.out.print("Массив является строго возрастающей последовательностью");
        }
        else {
        System.out.print("Массив не является строго возрастающей последовательностью");
    }

    }
}