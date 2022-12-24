package lab23;

public class SportCar extends Car {
    int maxSpeed;

    public SportCar(String marka, String classs, int weight, Engine engine, int maxSpeed) {
        super(marka, classs, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    public void start() {
        System.out.println("Спорткар поехал");
    }

    public void stop() {
        System.out.println("Спорткар остановился");
    }

    public void printInfo() {
        System.out.print("Марка спорткара: " + marka + "\nКласс: " + classs + "\nВес: " + weight
                + "\nМощность двигателя: " + engine.power + "\nПроизводитель двигателя: " + engine.maker
                + "\nМаксимальная скорость: " + maxSpeed + "\n\n");
    }
}