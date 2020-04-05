package Obiekty;

public class Cow implements Animal{
    public void dajMleko (){
        // daja mleko
    }

    @Override
    public void makeSound() {
        System.out.println("Muuuuu!");
    }

    @Override
    public void move() {

    }
}
