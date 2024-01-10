public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375298764538", "iPhone", 200);
        Phone phone2 = new Phone("+375292000998", "iPhone", 200);
        Phone phone3 = new Phone("+375331230987", "Huawei", 250);

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println();
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());
        System.out.println();


        phone1.receiveCall("Number 1");
        System.out.println(phone1.getNumber());
        System.out.println();

        phone2.receiveCall("Number 2");
        System.out.println(phone2.getNumber());
        System.out.println();

        phone3.receiveCall("Number 3");
        System.out.println(phone3.getNumber());
        System.out.println();


        phone1.receiveCall("Me", "+3752987687687");
        System.out.println();

        String[] arrayNubmer= {"+375333181003", "+375292097654", "+375333181003"};
        phone1.sendMassage(arrayNubmer);



    }
}