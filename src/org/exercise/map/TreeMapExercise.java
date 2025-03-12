package org.exercise.map;

import java.util.TreeMap;

public class TreeMapExercise {
  /*Esercizio 8: TreeMap e ordinamento delle chiavi

  Crea un TreeMap<Integer, String> per memorizzare ID di prodotti e nomi di prodotti.
  Aggiungi almeno 5 elementi e stampa la mappa per verificare l’ordinamento automatico.
  Usa firstEntry() e lastEntry() per ottenere il primo e l’ultimo elemento. */

  public static void main(String[] args) {
    TreeMap<Integer, String> idToProdotti = new TreeMap<>();
    idToProdotti.put(25, "Shampoo");
    idToProdotti.put(1, "Sapone");
    idToProdotti.put(50, "Spugna");
    idToProdotti.put(2, "Dispenser");
    System.out.println(idToProdotti);
    System.out.println("firstEntry(): " + idToProdotti.firstEntry());
    System.out.println("lastEntry(): " + idToProdotti.lastEntry());
  }
}
