package obiekty2;

public class Hamster extends Animal2 {

    public Hamster(string imie) { super(imie) }

    @Override
    void makeSound() {
        System.out.println("?");

    }
    @Override
    public void move() {

        System.out.println("Biegam");
    }
}
