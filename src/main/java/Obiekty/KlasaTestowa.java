package Obiekty;

import java.util.ArrayList;

public class KlasaTestowa {
    public static void main(String[] args) {
        Animal zwierzeta[] = new Animal[5];
        list<Animal> listaZwierzat = new ArrayList<Animal>();

        zwierzeta[0] = new Cat();
        zwierzeta[1] = new Cat();
        zwierzeta[2] = new Cow();
        zwierzeta[3] = new Dog();
        zwierzeta[4] = new Dog();

        listaZwierzat.add(new Dog());
        istaZwierzat.add(new Dog());
        istaZwierzat.add(new Cow());
        istaZwierzat.add(new Cow());
        istaZwierzat.add(new Cat());
        istaZwierzat.add(new Cat());
        dajGlosDlaTablicyZwierzat(zwierzeta);

    }

    public static void dajGlosDlaTablicyZwierzat(Animal zwierzeta[]) {
        for (Animal animal : zwierzeta) {
            animal.makeSound();
        }
    }


}
