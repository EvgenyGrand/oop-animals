package animals;

import java.util.ArrayList;

public class Start {


    public Start() {
    }

    public static void main(String[] args) {


        Animal animal = new Animal("animal", 1, 2, "Gray");
        Cat cat = new Cat("Барсик", 3, 5, "Черный");
        Dog dog = new Dog("Барбос", 5, 15, "Рыжий");
        Duck duck = new Duck("Велизарий", 1, 3, "Пестрый");


        ArrayList<Animal> Animal = new ArrayList<>();



        Animal.add(cat);
        Animal.add(dog);
        Animal.add(duck);


        WhyAnimals(Animal);
    }

    public static void WhyAnimals(ArrayList<Animal>Animals){
        for (Animal element : Animals){
            element.toString();
        }
    }

    }
    





