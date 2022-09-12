package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public abstract class Animal {
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


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
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

    public String subtitutionAge() {
        String old = null;
        try {
            if (age == 1) {
                old = " мне " + age + " год";
            } else if (age >= 2 && age < 5) {
                old = " мне " + age + " года";
            } else if (age >= 5 && age < 21) {
                old = " мне " + age + " лет";
            } else {
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
        return ("Привет! " + "меня зовут " + name + "," + subtitutionAge() + ", я вешу - " + weight + " кг," + " мой цвет - " + color);

    }






    }




