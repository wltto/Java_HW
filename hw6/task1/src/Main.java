public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Кот", 2);
        cat.makeNoise();

        Animal dog = new Dog("Собака", 4);
        dog.makeNoise();

        Animal rat = new Rat("Крыса", 5);
        rat.makeNoise();

    }
}