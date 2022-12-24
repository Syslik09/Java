package lab2;

public class Cat extends Animal {
    String name;
    public Cat(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("Cat eat");
    }
}