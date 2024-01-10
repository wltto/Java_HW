import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите дату в формате \"years/month/day hours:minuts\"");
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();


        Matcher matcher = Pattern.compile("^(1000|1[0-9]{3}|200[0-9]|201[0-2])/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|30)\\s([01][0-9]|2[0-3]):([0-5][0-9])$").matcher(date);

        if (matcher.matches()){
            System.out.println(date + " существует");
        }else {
            System.out.println(date + " не существует");
        }
    }
}