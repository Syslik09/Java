package lab22;

public class Phone {
    String model;
    Integer number;
    Double weight;
    String name = "Vlad";

    public Phone (String model, Integer number, Double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
    }
    public void receiveCall() {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "n" + number);
    }
    public void getNumber() {
        System.out.println(number);
    }

    public void sendMessage(int number1, int number2) {

        System.out.println(number1 + " " + number2);

    }

    public static void main(String[] args) {
        Phone Phone = new Phone();

        Phone Iphone = new Phone();
        Iphone.number = 812234341;
        Iphone.model = "14 Pro Max";
        Iphone.weight = 234.5;

        Phone Samsung = new Phone();
        Samsung.number = 832443422;
        Samsung.model = "S21 Ultra";
        Samsung.weight = 315.6;

        Phone Xiaomi = new Phone();
        Xiaomi.number = 812312321;
        Xiaomi.model = "Redmi 11 Pro";
        Xiaomi.weight = 325.1;

        Phone OnePlus = new Phone();
        OnePlus.number = 819232311;
        OnePlus.model = "9RT";

        Iphone.receiveCall();
        Samsung.receiveCall();
        Xiaomi.receiveCall();

        Iphone.getNumber();
        Samsung.getNumber();
        Xiaomi.getNumber();

        System.out.println("Iphone: Номер телефона: " + Iphone.number + ", Модель: " + Iphone.model + ", Вес: " + Iphone.weight);
        System.out.println("Samsung: Номер телефона: " + Samsung.number + ", Модель: " + Samsung.model+", Вес: " + Samsung.weight);
        System.out.println("Xiaomi: Номер телефона: " + Xiaomi.number + ", Модель: " + Xiaomi.model + ", Вес: " + Xiaomi.weight);
        System.out.println("OnePlus: Номер телефона: " + OnePlus.number + ", Модель: " + OnePlus.model);
        Phone.sendMessage(Iphone.number, Samsung.number);


    }
}