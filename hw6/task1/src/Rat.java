public class Rat extends Animal{

    public Rat(String name, int age) {
        super(name, age);
    }

    public Rat() {
    }

    @Override
    void makeNoise() {
        System.out.println("Пи");
    }
}