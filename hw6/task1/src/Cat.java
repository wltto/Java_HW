public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    void makeNoise() {
        System.out.println("Мяу");
    }

}