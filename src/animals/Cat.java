package animals;

public class Cat extends Animal {


    protected Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Мяу!");
    }

    public void addCat() {
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

    }
}


