package lab2;

public class Data {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Батон","Мясо", "Будка");
        animals[1] = new Cat("Марсик","Рыба", "Квартира");
        animals[2] = new Horse("Мустанг","Сено", "Загон");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
