package animals;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
    public static void main(String[] args) {

        ArrayList<Animal> Animal = new ArrayList<>();
        Cat Barsik = new Cat("Барсик", 3, 5, "Черный");
        Dog Barbos = new Dog("Барбос", 5, 15, "Рыжий");
        Duck Velizarii = new Duck("Велизарий", 1, 3, "Пестрый");

        Animal.add(Barsik);
        Animal.add(Barbos);
        Animal.add(Velizarii);


    }
}




