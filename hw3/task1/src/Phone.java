public class Phone {
    private String number;
    private String model;
    private int weight;


    public Phone(String number, String model, int weight){
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public Phone(String number, String model){
    }

    public Phone(){
    }


    public String getNumber() {return number;}

    public void setNumber(String number) {
        this.number = number;
    }


    public String getModel() {return model;}

    public void setModel(String model) {
        this.model = model;
    }


    public int getWeight() {return weight;}

    public void setWeight(int weight) {
        this.weight = weight;
    }


    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number){
        System.out.println("Звонит: " + name + "\n" + "Номер: "  + number);
    }

    String getNumber(String number){
        return number;
    }

    void sendMassage(String ...number){
        System.out.println("Сообщение будет отправлено на номера:");
        for (String n: number) {
            System.out.println(n + " ");
        }
    }





}