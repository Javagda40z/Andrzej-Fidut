package Obiekty;

public class Dog implements Animal{


    public void aportuj () {
        // pies aportuje
    }

    @Override
    public void makeSound() {
        System.out.println("Hau!");
    }

    @Override
    public void move() {

    }
}
