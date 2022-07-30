package animals;

public class Start {
    public static void main(String[] args) {


        Animal animal = new Animal("animal", 1, 2, "Gray");
        Cat cat = new Cat("Барсик", 3, 5, "Черный");
        Dog dog = new Dog("Барбос", 30, 15, "Рыжий");
        Duck duck = new Duck("Велизарий", 3, 1, "Пестрый");

        cat.drink();
        duck.fly();
        dog.toString();
    }

}



