package lab23;

public class Lorry extends Car {
    int gruz;

    public Lorry(String brand, String classs, int weight, Engine engine, int gruz) {
        super(brand, classs, weight, engine);
        this.gruz = gruz;
    }

    public void start() {
        System.out.println("Грузовик поехал");
    }

    public void stop() {
        System.out.println("Грузовик остановился");
    }

    public void printInfo() {
        System.out.print("Марка грузовика: " + marka + "\nКласс: " + classs + "\nВес: " + weight + "\nМощность двигателя"
                        + engine.power + "\nПроизводитель двигателя" + engine.maker + "\nГрузоподъемность: " + gruz + "\n\n");
    }
}