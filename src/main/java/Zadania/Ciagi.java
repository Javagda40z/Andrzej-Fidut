package Zadania;

import java.time.LocalDateTime;
import util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ciagi {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();

        lista.add(15);
        lista.add(20);
        lista.add(30);

        System.out.println(lista);
        lista.add(444);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        System.out.println(stworzCiagArytmetyczny(5, 1, 1));

        List<String> listaPracownikow = new LinkedList<String>();
        listaPracownikow.add("Mateusz");
        listaPracownikow.add("Mateusz2");
        listaPracownikow.add("Marika");

        List<String> listaPracownikowZInnegoDzialu = new ArrayList<String>();

        listaPracownikowZInnegoDzialu.add("Mateusz1");
        listaPracownikowZInnegoDzialu.add("Mateusz3");
        listaPracownikowZInnegoDzialu.add("Marika2");

        dajPodwyzke(listaPracownikow);
        dajPodwyzke(listaPracownikowZInnegoDzialu);

    }
    public static void dajPodwyzke(list<String> pracownicy){
        // daje podwyżkę każdemu pracownikowi
    }
}
