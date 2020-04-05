package Obiekty;

public class Cat implements Animal {
    private int licznik = 0;
    private String imie;

    public Cat(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void drap () {
        //kot drapie
    }
    public void eatMause() {n
        licznik++;
        System.out.println("Zjadlem" +  licznik + "Myszy");
    }

    @Override
    public void makeSound() {
        System.out.println("Miiiau!");
    }

    @Override
    public void move() {
        System.out.println("Chodze!");
    }
}
