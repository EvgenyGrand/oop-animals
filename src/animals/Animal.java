package animals;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private final String NAME;
    private final int AGE;
    private final int WEIGHT;
    private final String COLOR;

    protected Animal(String name, int age, int weight, String color) {
        this.NAME = name;
        this.AGE = age;
        this.WEIGHT = weight;
        this.COLOR = color;
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
            if (AGE == 1){
                old =" мне " + AGE + " год";
            }else if (AGE >= 2 && AGE < 5) {
                old = " мне " + AGE + " года";
            } else if (AGE >= 5 && AGE < 21) {
                old = " мне " + AGE + " лет";
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
        System.out.println ("Привет! " + "меня зовут " + NAME + "," + old() + ", я вешу - " + WEIGHT + " кг," + " мой цвет - " + COLOR);
        return null;
    }


}

