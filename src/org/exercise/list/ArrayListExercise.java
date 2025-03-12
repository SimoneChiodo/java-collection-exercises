package org.exercise.list;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExercise {

  /*Esercizio 4: Uso di ArrayList

  Crea un ArrayList<String> e aggiungi 5 nomi di frutta.
  Ordina la lista con Collections.sort().
  Rimuovi un elemento e stampa il risultato.
  Itera sugli elementi con un ciclo for e un Iterator. */  

  public static void main(String[] args) {
    // Creo la lista
    ArrayList<String> frutta = new ArrayList<>();
    frutta.add("Pera");
    frutta.add("Mela");
    frutta.add("Banana");
    System.out.println("Normale: " + frutta);

    // Riordino la lista
    Collections.sort(frutta);
    System.out.println("Ordinata: " + frutta);

    // Rimuovo un elemento
    frutta.remove(1);
    System.out.println("Senza l'elemento in posizione 1: " + frutta);

    // Ciclo for
    for(int i = 0; i < frutta.size(); i++){
      System.out.println("Elemento " + i + ") " + frutta.get(i));
    }

    // Ciclo con Iterator
    Iterator<String> iterator = frutta.iterator();
    System.out.println("Elementi con Iterator: ");
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }

}
