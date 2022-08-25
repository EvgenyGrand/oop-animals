package animals;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {


        ArrayList<Animal> Animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Scanner comm = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command : ");
            Command selection = Command.valueOf(comm.next().trim().toUpperCase());

            switch (selection) {
                case ADD:
                    System.out.println("Введите животное : cat/dog/duck");
                    String animalType = sc.next().toLowerCase().trim();


                    if (animalType.equals("cat")) {
                        System.out.println("Введите имя");
                        String name = sc.next();
                        System.out.println("Введите возраст");
                        int age = sc.nextInt();
                        System.out.println("Введите вес");
                        int weight = sc.nextInt();
                        System.out.println("Введите цвет");
                        String color = sc.next();
                        Cat cat = new Cat(name, age, weight, color);
                        Animals.add(cat);
                        cat.say();

                    } else if (animalType.equals("dog")) {
                        System.out.println("Введите имя");
                        String name = sc.next();
                        System.out.println("Введите возраст");
                        int age = sc.nextInt();
                        System.out.println("Введите вес");
                        int weight = sc.nextInt();
                        System.out.println("Введите цвет");
                        String color = sc.next();
                        Dog dog = new Dog(name, age, weight, color);
                        Animals.add(dog);
                        dog.say();

                    } else if (animalType.equals("duck")) {
                        System.out.println("Введите имя");
                        String name = sc.next();
                        System.out.println("Введите возраст");
                        int age = sc.nextInt();
                        System.out.println("Введите вес");
                        int weight = sc.nextInt();
                        System.out.println("Введите цвет");
                        String color = sc.next();
                        Duck duck = new Duck(name, age, weight, color);
                        Animals.add(duck);
                        duck.say();

                    }
                    break;
                case LIST:
                    for (Animal animal : Animals) {
                        System.out.println(animal);
                    }
                    break;
                case EXIT:
                    System.out.println("Выход из программы");
                    System.exit(0);
                default:
                    System.out.println("Wrong command, try again");


            }
        }


    }


}










    





