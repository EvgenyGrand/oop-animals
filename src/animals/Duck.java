package animals;

public class Duck extends Animal implements Flying {
    protected Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say(){
        System.out.println("Кря!");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");

    }

}
