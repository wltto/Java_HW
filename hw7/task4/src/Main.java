import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String str =  "ab abab abab abababab abea";

        Matcher matcher = Pattern.compile("ab+").matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group());
        }



    }
}