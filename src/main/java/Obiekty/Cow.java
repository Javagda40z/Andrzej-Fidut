package Obiekty;

public class Cow implements Animal {

    public void dajMleko() {
        // krowy daja mleko
    }

    @Override
    public void makeSound() {
        System.out.println("Muuuuu!");
    }

    @Override
    public void move() {
        System.out.println("Chodze");

    }
}
