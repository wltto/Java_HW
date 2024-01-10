public class Main {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 56;

        StringBuilder strBld = new StringBuilder();

        strBld.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2 + "\n");
        strBld.replace(strBld.indexOf("="),strBld.indexOf("=") + 1, "равно");

        strBld.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2 + "\n");
        strBld.replace(strBld.indexOf("="),strBld.indexOf("=") + 1, "равно");

        strBld.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        strBld.replace(strBld.indexOf("="),strBld.indexOf("=") + 1, "равно");


        System.out.println(strBld);




    }
}