public class IncorrectInfoException extends Exception{

    private String fullName;
    private int age;

    public IncorrectInfoException(String message, String fullName, int age) {
        super(message);
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {return fullName;}

    public void setFullName(String fullName) {this.fullName = fullName;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}






}