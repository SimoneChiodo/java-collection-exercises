package org.exercise.set;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExercise {

  /*Esercizio 1: Operazioni di base con HashSet

  Crea un HashSet<String> e aggiungi almeno 5 nomi di città.
  Stampa il set per verificare l’ordine degli elementi.
  Controlla se un determinato elemento è presente.
  Rimuovi un elemento e verifica che sia stato eliminato.
  Itera sugli elementi con un Iterator.*/

  public static void main(String[] args) {
    // Creazione HashSet
    HashSet<String> cities = new HashSet<>();
    cities.add("Roma");
    cities.add("Milano");
    cities.add("Genova");
    cities.add("Napoli");
    cities.add("Torino");
    System.out.println(cities);

    // Ricerca elemento
    System.out.println("Cerca una città: ");
    Scanner input = new Scanner(System.in);
    String cityToSearch = input.next();
    System.out.println(cities.contains(cityToSearch) ? "L'elemento e' presente" : "L'elemento NON e' presente");

    // Eliminazione elemento
    System.out.println("Elimina una città: ");
    String cityToDelete = input.next();
    System.out.println(cities.remove(cityToDelete) ? "L'elemento e' stato elinato" : "L'elemento NON e' presente. Impossibile eliminare");
    System.out.println(cities);
    input.close();

    // Iterator
    Iterator<String> iterator = cities.iterator();
    while(iterator.hasNext()){ // Ciclo fino alla fine dell'array
      System.out.println(iterator.next()); // Proseguo al prossimo elemento dell'array
    }
  }


}
