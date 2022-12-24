package lab23;

public abstract class Car {
    String marka;
    String classs;
    int weight;
    Engine engine;

    public Car(String marka, String classs, int weight, Engine engine) {
        this.marka = marka;
        this.classs = classs;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();


    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}