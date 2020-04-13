package Klasy;

import java.util.List;

public class Klasy {
    public static void main(String[] args) {

        list<string> arrayList = new ArrayList<string>();
        list<string> linkedList = new LinkedList<string>();
        arrayList.add("tests");
        wypiszListe(arrayList);
        wypiszListe(linkedList);
        wypiszListe(lista: "asd");
    }
    pablic static void wypiszListe(Object lista) {
        // if (lista instanceof List) {   // raczej tak nie robimy
        List napewnoLista = ((List) lista);

        napewnoLista.size();

        //       System.out.println("To jest lista o rozmiarze" + napewnoLista.size());
        //             }  else {
   //     System.out.println("To nie jest lista");
   //      }



    }
}
