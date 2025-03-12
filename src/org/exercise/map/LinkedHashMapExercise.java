package org.exercise.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExercise {
  /*Esercizio 7: LinkedHashMap e mantenimento dell’ordine

  Crea un LinkedHashMap<String, String> per memorizzare coppie di paesi e capitali.
  Inserisci almeno 5 coppie e stampa la mappa.
  Aggiungi una nuova coppia già presente e osserva il comportamento. */

  public static void main(String[] args) {
    // Creo la LinkedHashMap
    LinkedHashMap<String, String> paesiToCapitali = new LinkedHashMap<>();
    paesiToCapitali.put("Italia", "Roma");
    paesiToCapitali.put("Francia", "Parigi");
    paesiToCapitali.put("Germania", "Berlino");
    paesiToCapitali.put("Spagna", "Madrid");
    paesiToCapitali.put("Regno Unito", "Londra");
    System.out.println(paesiToCapitali);

    // Aggiungo una coppia già esistente
    paesiToCapitali.put("Spagna", "Madrid");
    System.out.println("Aggiunta di nuovo Spagna");
    System.out.println(paesiToCapitali);
  }
}
