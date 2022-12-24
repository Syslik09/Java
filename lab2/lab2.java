package lab2;

import java.lang.reflect.Method;
import java.security.PublicKey;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        abstract class Animal {
            String food;
            String location;

            public Animal() {
            }

            public Animal(String food, String location) {
                this.food = food;
                this.location = location;
            }

            public String getFood() {
                return food;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public abstract void eat();

            public abstract String makeNoise();

            public void sleep() {
                System.out.println("Животное спит");
            }

            abstract class Cat extends Animal {
                String color;

                public Cat() {

                }

                public Cat(String food, String location) {
                    super(food, location);
                }

                public String getColor() {
                    return color;
                }

                public void eat() {
                    System.out.println("У кошки перекус");
                }

                public String makeNoise() {
                    return "мяу-мяу-мяу!";
                }

                public String toString() {
                    return "Cat{" +
                            "food='" + getFood() + '\'' +
                            '}';
                }
            }

            abstract class Dog extends Animal {
                String name;

                Dog() {
                }

                public Dog(String food, String location) {
                    super(food, location);
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void eat() {
                    System.out.println("Собака ест.");
                }

                public String makeNoise() {
                    return "Гав-гав-гав!!!";
                }

                public String toString() {
                    return "Dog{" +
                            "food='" + getFood() + '\'' +
                            ", location='" + getLocation() + '\'' +
                            '}';
                }
            }

            class Horse extends Animal {
                private double weight;

                public Horse() {
                }

                public Horse(String food, String location) {
                    super(food, location);
                }

                public double getWeight() {
                    return weight;
                }

                public void setWeight(double weight) {
                    this.weight = weight;
                }

                public void eat() {
                    System.out.println("Лошадь ест.");
                }

                public String makeNoise() {
                    return "Иго-го-го-го!!!";
                }

                public String toString() {
                    return "Horse{" +
                            "food='" + getFood() + '\'' +
                            ", location='" + getLocation() + '\'' +
                            '}';
                }
            }
        }
    }
}