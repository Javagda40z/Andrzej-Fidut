package Zadania;

public class Program {

    static int a;

    public static void main(String[] args) {
 /*       Program program = new Program();
        program. tabliczkaMnozenia(5);
        program.tabliczkaMnozenia(10);
        tabliczkaMnożenia(5);

        TabliczkaMnozenia tabliczkaMnozenia = new TabliczkaMnozenia(5);
        System.out.println(tabliczkaMnozenia.getLiczba());
        tabliczkaMnozenia.wypiszTabliczke();

        tabliczkaMnozenia = new TabliczkaMnozenia(10);
        tabliczkaMnozenia.wypiszTabliczke();

  */

 //Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y

        // silnia - rekurencja

//        System.out.println(silnia(5));

//        System.out.println(sumaLiczb(1, 5));

        int i; // nie ma warości domyślnej

        System.out.println(a);
    }

    public static int sumaLiczb(int x, int y) {

        int suma = 0;
        for (int i = x; i <= y; i++) {

            int suma = suma + i;
        }
        return suma;
    }

    public static void tabliczkaMnozenia(int liczba) {
        System.out.println("Tabliczka mnożenia dla liczby: " + liczba);
        for (int i = 1; i <= liczba; i++) {
            System.out.println(liczba + " x " i + " = " + liczba * i);
        }
    }

    // tabliczka mnożenia dla liczby 5
    // 5 * 1 = 5
    // 5 * 2 = 10
    // 5 * 3 = 15
    // 5 * 4 = 20
    // 5 * 5 = 25

}
