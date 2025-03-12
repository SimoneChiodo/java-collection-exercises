package org.exercise.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercise {
  /*Esercizio 6: HashMap per memorizzare valori

  Crea un HashMap<String, Integer> per memorizzare nomi di studenti e i loro voti.
  Aggiungi almeno 5 coppie chiave-valore.
  Controlla se una chiave specifica è presente.
  Stampa tutte le chiavi e tutti i valori separatamente.
  Usa un Iterator per scorrere gli elementi. */

  public static void main(String[] args) {
    // Creo l'HashMap
    HashMap<String, Integer> studentsToVotes = new HashMap<>();
    studentsToVotes.put("Paolo", 8);
    studentsToVotes.put("Lorenzo", 9);
    studentsToVotes.put("Marcello", 6); 
    System.out.println(studentsToVotes);

    // Stampo tutte le key e i valori
    System.out.println("Tutte le key: " + studentsToVotes.keySet());
    System.out.println("Tutti i valori: " + studentsToVotes.values());

    // Controllo se contiene una chiave
    System.out.println("Cerca una chiave: ");
    Scanner scanner = new Scanner(System.in);
    String keyToSearch = scanner.next();
    scanner.close();
    System.out.println(studentsToVotes.containsKey(keyToSearch) ? "La key è contenuta" : "La key NON è contenuta");
  }
}
