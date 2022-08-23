package animals;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {



//        Cat cat = new Cat("Барсик", 3, 5, "Черный");
//        Dog dog = new Dog("Барбос", 5, 15, "Рыжий");
//        Duck duck = new Duck("Велизарий", 1, 3, "Пестрый");


        ArrayList<Animal>Animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter command : ");
            String selection = sc.nextLine();

            switch (selection){
                case "ADD" :
                    System.out.println("Введите животное : cat/dog/duck");
                    String animalType = sc.nextLine();
                     if(animalType.equals("cat")) {
                         System.out.println("Введите имя");
                         String name = sc.nextLine();
                         System.out.println("Введите возраст");
                         int age = sc.nextInt();
                         System.out.println("Введите вес");
                         int weight = sc.nextInt();
                         System.out.println("Введите цвет");
                         String color = sc.next();
                         Cat cat = new Cat(name, age, weight, color);
                         Animals.add(cat);
                         cat.say();
                     }else if (animalType.equals("dog")){
                         System.out.println("Введите имя");
                         String name = sc.nextLine();
                         System.out.println("Введите возраст");
                         int age = sc.nextInt();
                         System.out.println("Введите вес");
                         int weight = sc.nextInt();
                         System.out.println("Введите цвет");
                         String color = sc.next();
                         Dog dog = new Dog(name, age, weight, color);
                         Animals.add(dog);
                         dog.say();
                     }else if (animalType.equals("duck")) {
                         System.out.println("Введите имя");
                         String name = sc.nextLine();
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
                case "LIST" :
                    for (Animal animal: Animals){
                        System.out.println(Animals);
                    }
                    break;
                case "EXIT" :
                    System.out.println("Выход из программы");
                    System.exit(0);
                default:
                    System.out.println("Wrong command, try again");
            }
        }



    }



    }









    





