package animals;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {


        ArrayList<Animal>animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Enter command : ");
            Command selection = Command.valueOf(sc.next().trim().toUpperCase());

            switch (selection) {
                case ADD:
                    System.out.println("Введите животное : cat/dog/duck");
                    String animalType = sc.next().toLowerCase().trim();


                    if (animalType.equals("cat")) {

                        System.out.println("Введите имя");
                        String name = sc.next();
                        System.out.println("Введите возраст");
                        int age = sc.nextInt();
                        if (age >1 && age<30) {
                            System.out.println("Возраст введен корректно!");
                        }else{
                            System.out.println("Возраст введен некорректно!, Введите возраст в диапазоне от 1 года до 30 лет");
                            System.exit(0);
                        }
                        System.out.println("Введите вес");
                        int weight = sc.nextInt();
                        System.out.println("Введите цвет");
                        String color = sc.next();
                        Cat cat = new Cat(name, age, weight, color);
                        animals.add(cat);
                        cat.say();

                    } else if (animalType.equals("dog")) {
                        System.out.println("Введите имя");
                        String name = sc.next();
                        System.out.println("Введите возраст");
                        int age = sc.nextInt();
                        if (age >1 && age<30) {
                            System.out.println("Возраст введен корректно!");
                        }else{
                            System.out.println("Возраст введен некорректно!, Введите возраст в диапазоне от 1 года до 30 лет");
                            System.exit(0);
                        }
                        System.out.println("Введите вес");
                        int weight = sc.nextInt();
                        System.out.println("Введите цвет");
                        String color = sc.next();
                        Dog dog = new Dog(name, age, weight, color);
                        animals.add(dog);
                        dog.say();

                    } else if (animalType.equals("duck")) {
                        System.out.println("Введите имя");
                        String name = sc.next();
                        System.out.println("Введите возраст");
                        int age = sc.nextInt();
                        if (age >1 && age<5) {
                            System.out.println("Возраст введен корректно!");
                        }else{
                            System.out.println("Возраст введен корректно!, Введите возраст в диапазоне от 1 года до 30 лет");
                            System.exit(0);
                        }
                        System.out.println("Введите вес");
                        int weight = sc.nextInt();
                        System.out.println("Введите цвет");
                        String color = sc.next();
                        Duck duck = new Duck(name, age, weight, color);
                        animals.add(duck);
                        duck.say();

                    }
                    break;
                case LIST:
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
}
