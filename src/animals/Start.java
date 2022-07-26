package animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Start {


    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();


        while (true) {
            System.out.println("Введите команду из списка : ADD/LIST/EXIT : ");
            Command selection = Command.valueOf(sc.next().trim().toUpperCase());

            switch (selection) {
                case ADD:
                    animals.add(createAnimal());
                    break;
                case LIST:
                    animals.removeAll(Arrays.asList(null, ""));
                    for (Animal animal : animals) {
                        System.out.println(animal);
                    }
                    break;
                case EXIT:
                    System.out.println("Выход из программы");
                    System.exit(0);

            }
        }

    }

    protected static Animal createAnimal() {

        System.out.println("Введите животное : cat/dog/duck");
        String animalType = sc.next().toLowerCase().trim();
        if (animalType.equals("cat")) {
            System.out.println("Введите имя");
            String name = sc.next();
            System.out.println("Введите возраст в диапазоне от 0 до 30 лет!");
            int age = sc.nextInt();
            while (age > 0 && age < 30) {
                System.out.println("Возраст введен корректно!");
                System.out.println("Введите вес");
                int weight = sc.nextInt();
                System.out.println("Введите цвет");
                String color = sc.next();
                Cat cat = new Cat(name, age, weight, color);
                cat.say();
                return cat;

            }

        } else if (animalType.equals("dog")) {
            System.out.println("Введите имя");
            String name = sc.next();
            System.out.println("Введите возраст в диапазоне от 0 до 30 лет");
            int age = sc.nextInt();
            while (age > 0 && age < 30) {
                System.out.println("Возраст введен корректно!");
                System.out.println("Введите вес");
                int weight = sc.nextInt();
                System.out.println("Введите цвет");
                String color = sc.next();
                Dog dog = new Dog(name, age, weight, color);
                dog.say();
                return dog;
            }


        } else if (animalType.equals("duck")) {
            System.out.println("Введите имя");
            String name = sc.next();
            System.out.println("Введите возраст в диапазоне от 0 до 5 лет");
            int age = sc.nextInt();
            while (age > 0 && age < 5) {
                System.out.println("Возраст введен корректно!");
                System.out.println("Введите вес");
                int weight = sc.nextInt();
                System.out.println("Введите цвет");
                String color = sc.next();
                Duck duck = new Duck(name, age, weight, color);
                duck.say();
                return duck;
            }
        }
        return null;


    }
}




