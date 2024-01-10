import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вставьте ссылку:");
        Scanner scn = new Scanner(System.in);
        String ref = scn.nextLine();

        Matcher matcher = Pattern.compile("^[a-zA-Z0-9]+.com").matcher(ref);
        System.out.println(matcher.matches());


    }
}