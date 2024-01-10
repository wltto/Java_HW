public class Guiter implements Instrument {

    private int countString = 7;

    public Guiter(int countString) {
        this.countString = countString;
    }

    public Guiter(){

    }

    public int getCountString() {
        return countString;
    }

    public void setCountString(int countString) {
        this.countString = countString;
    }


    @Override
    public void play() {
        System.out.println("Играет гитара.\nКоличество струн в гитаре = " + countString);
    }
}