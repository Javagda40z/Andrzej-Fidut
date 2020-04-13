package Zadania;

public class MathUtils {

    public static boolean czyPierwsza(int liczba) {
        for (int i = 2; i < liczba, i++) {
            if (liczba % i == 0) {
                returnfalse;
            }
        }
        return true;
    }
}
