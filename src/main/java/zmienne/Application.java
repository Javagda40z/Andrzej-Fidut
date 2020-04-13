package zmienne;

public class Application {
    public static void main(String[] args) {
        int i = 5;
        double d = 5.1;
        float f = 10;
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println((i * d));
        i = (int) d;
        System.out.println(i);
        d = i;
        System.out.println(dodaj(a: 5, b: 5));
        System.out.println(odejmij(a: 10, b: 2));
        System.out.println(pomnoz(a: 5, b: 5));
        System.out.println(podziel(a: 5, b: 2));
        System.out.println(podziel(a: 5, b: 0));
        System.out.println(1.2 * 1.2);
        System.out.println(czyParzysta( a: 5));
        System.out.println(czyParzysta( a: 4));

    }


    public static boolean czyParzysta(int a) {
        return a % 2 == 0;
    }

    public static int dodaj(int a, int b) {
        return a + b;
    }

    public static int odejmij(int a, int b) {
        return a - b;
    }

    public static int pomnoz(int a, int b) {
        return a * b;
    }
    
    public static double podziel(int a, int b) {
        return ((double) a) / b;
    }
}
