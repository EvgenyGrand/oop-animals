package animals;

public class Animal {
    private final String name;
    private final int age;
    private final int weight;
    private final String color;

    protected Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

     public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        System.out.println ("Привет! " + "меня зовут " + name + ", мне " + age + " лет, " + "я вешу - " + weight + " кг," + " мой цвет - " + color);
        return null;
    }

}

