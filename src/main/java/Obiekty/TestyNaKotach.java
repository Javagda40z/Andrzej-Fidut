package Obiekty;

// Pokazanie czym jest enkapsulacja / hermetyzacja
public class TestyNaKotach {
    public static void main(String[] args)

    public void

    void main(String[] args) {
 /*       Cat filemon = Cat.stworzKota("Filemon");

        Cat kot = new Cat("JakisKot");


        System.out.println(filemon.getLicznikZlapanychMyszy());
        filemon.eatMouse();
        filemon.eatMouse();
        filemon.eatMouse();
        filemon.eatMouse();
        filemon.eatMouse();
        System.out.println(filemon.getLicznikZlapanychMyszy());

        if (czyPowinienDostacMleko(filemon)) {
            System.out.println("Daje mleko dla kota");
        } else {
            System.out.println("Za mało zjedzonych myszy, zjedz więcej to dostaniesz mleko");
      }
 */
        Cat cat1 = new Cat();
        Cat filemon = new Cat("Filemon");
        Cat cat2 = new Cat();
        System.out.println(cat1.getImie());
        System.out.println(filemon.getImie());
        System.out.println(cat2.getImie());

    }

    public static boolean czyPowinien

    DostacMleko(Cat cat) {

        if (cat.getLicznikZlapanychMyszy() > 10) {
            return true;
        } else {
            return false;
        }
    }
}
