package lab2;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void eat() {
        System.out.println("Eat");
    }

    public void makeNoise() {
        System.out.println("Noise");
    }

    public void sleep() {
        System.out.println("Sleep");
    }
}