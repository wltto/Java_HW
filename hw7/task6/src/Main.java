import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IncorrectInfoException {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Введите ваши ФИО через пробел: ");
            String fullname = scn.nextLine();

            String[] mass = fullname.split(" ");
            if (mass.length != 3){
                throw new IncorrectInfoException("Введите ваши ФИО через пробел", fullname, 0);
            }

            System.out.println("Введите ваш возраст:");
            int age = scn.nextInt();
            if (age > 100 || age < 0){
                throw new IncorrectInfoException("Ваш возраст не корректен", fullname, age);
            }

            if (fullname.length() > 200 || fullname.matches(".*[.,!?&].*")){
                throw new IncorrectInfoException("Данные не корректны", fullname, age);
            }

            System.out.println("Данные корректны");
        }catch (IncorrectInfoException e){
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("ФИО: " + e.getFullName());
            System.out.println("Возраст: " + e.getAge());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Некорректный формат возраста");
        }









    }
}