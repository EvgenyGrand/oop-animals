package animals;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {


    public Start() {
    }

    public static void main(String[] args) {


        Animal animal = new Animal("animal", 1, 2, "Gray");
        Cat cat = new Cat("Барсик", 3, 5, "Черный");
        Dog dog = new Dog("Барбос", 5, 15, "Рыжий");
        Duck duck = new Duck("Велизарий", 1, 3, "Пестрый");


        ArrayList<Animal> Animals = new ArrayList<>();

        Scanner console = new Scanner(System.in);

        String a = "ADD";
        Command abc = Command.valueOf(a);


        add_Dog(Animals,dog);
        add_Cat(Animals,cat);

        whyAnimals(Animals);
    }

    public static void whyAnimals(ArrayList<Animal> Animals) {
        for (Animal element : Animals) {
            element.toString();
        }

    }

    public static void add_Dog(ArrayList<Animal>Animals, Animal dog) {
        Animals.add(dog);
    }

    public static void add_Cat(ArrayList<Animal> Animals, Animal cat) {
        Animals.add(cat);
    }

    public static void add_Duck(ArrayList<Animal> Animals, Animal duck) {
        Animals.add(duck);

    }

}

    





