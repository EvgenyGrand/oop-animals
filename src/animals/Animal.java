package animals;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    protected final String name;
    protected final int age;
    protected final int weight;
    protected final String color;

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

    public String old() {
        String old = null;
        try {
            if (age == 1){
                old =" мне " + age + " год";
            }else if (age >= 2 && age < 5) {
                old = " мне " + age + " года";
            } else if (age >= 5 && age < 21) {
                old = " мне " + age + " лет";
            }else{
                old = "(Некорректный возраст, введите другое число)";
            }
        } catch (Exception e) {
            System.out.println("Некорректное значение ,введите другой возраст");
            e.printStackTrace();
        }
        return old;
    }




    @Override
    public String toString() {
        System.out.println ("Привет! " + "меня зовут " + name + "," + old() + ", я вешу - " + weight + " кг," + " мой цвет - " + color);
        return null;
    }


}

