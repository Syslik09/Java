package lab23;

public class Main {
    public static void main(String[] msi) {
        Engine engine = new Engine(350, "BMW Motors");
        Car car = new Car("BMW", "B", 1500, engine) {
            public void start() {
                System.out.println("Машина поехала");
            }

            public void stop() {
                System.out.println("Машина поехала");
            }

            public void printInfo() {
                System.out.print("Марка спорткара: " + marka + "\nКласс: " + classs + "\nВес: " + weight
                        + "\nМощность двигателя: " + engine.power + "\nПроизводитель двигателя: " + engine.maker + "\n\n");

            }
        };
        Lorry lorry = new Lorry("Mercedes-benz", "Lorry", 12000, engine, 2500);
        SportCar sportcar = new SportCar("Honda", "C", 1250, engine, 300);
        car.printInfo();
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
        sportcar.printInfo();
        sportcar.start();
        sportcar.stop();
        lorry.printInfo();
        lorry.start();
        lorry.stop();
    }
}