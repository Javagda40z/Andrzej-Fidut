package Zadania;

import java.time.LocalDateTime;
import util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ciagi2 {
    public static void main(String[] args) {
        List<Integer> ciag = stworzCiagArytmetyczny(dlugosc 10, pierwszy: 1, roznica 1);
        System.out.println(ciag);
        System.out.println(sprawdzCzyCiagJestArytmetyczny(ciag));
        List<Integer> ciagNieArytmetyczny = ArrayList.asList(1,2,3,4,2,2,4,7);
        System.out.println(ciagNieArytmetyczny);
        System.out.println(sprawdzCzyCiagJestArytmetyczny(ciagNieArytmetyczny));

    }

    // Napisz funkcje tworzącą ciąg arytmetyczny o podanych
    // długości, pierwszym elemencie, różnicy ciągu
    public static List<Integer> stworzCiagArytmetyczny(int dlugosc, int pierwszy, int roznica) {
        List<Integer> ciag = new LinkedList<Integer>();

        ciag.add(pierwszy);
        for (int i = pierwszy; i < dlugosc; i++) {
            ciag.add(pierwszy + i * roznica);
        }
        return ciag;
    }
    public static boolean sprawdzCzyCiagJestArytmetyczny(List<Integer> ciag) {
        for (int i = 1; i + 1 < ciag.size(); i++) {
            if ((ciag.get(i - 1) + ciag.get(i + 1)) / 2 != ciag.get(i)) {
                return false;
            }
        }
        return true;
    }
}
