public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    void makeNoise() {
        System.out.println("Гав");
    }
}