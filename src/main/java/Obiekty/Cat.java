package Obiekty;

public class Cat implements Animal {
    private static int licznikKotow = 0;
    private int licznikZlapanychMyszy = 0;
    private String imie;

    //  public Cat(String imie) {    //nie mozna stwożyć poza tą klaś
    //    this.imie = imie;
    // }

    public Cat() {
        this(imie : "Kot o ID: " + licznikKotow);
        licznikKotow++;
    }

    public Cat(String imie) {
        this.imie = imie;
    }


    public static Cat stworzKota(String imie) {  // to może
        Cat kot = new Cat(imie);
        kot.licznikZłapanychMyszy = 50;
        return kot;
    }

    public void drap() {
        // kot drapie
    }

    public void eatMoused() {
        licznikZłapanychMyszy++;  // <-> licznik = licznik + 1;
        System.out.println("Zjadłem " + licznikZłapanychMyszy + "myszy ");

    }

    public int getLicznikZlapanychMyszy() {
        return licznikZłapanychMyszy;
    }


    @Override
    public void makeSound() {
        System.out.println("Miauuu");
    }


    @Override
    public void move() {

        System.out.println("Chodzę");
    }

    public String getImie() {
        return imie;
    }
}
