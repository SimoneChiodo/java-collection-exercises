package org.exercise.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExercise {

  /*Esercizio 2: LinkedHashSet e l’ordine di inserimento

  Crea un LinkedHashSet<Integer> e inserisci i numeri 10, 5, 30, 20, 15.
  Stampa il set e osserva l’ordine.
  Aggiungi un numero già presente e verifica il comportamento.*/

  public static void main(String[] args) {
    // Creazione LinkedHashSet
    LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
    numbers.add(10);
    numbers.add(5);
    numbers.add(30);
    numbers.add(20);
    numbers.add(15);
    System.out.println(numbers);
    numbers.add(15);
    System.out.println(numbers);  
  }


}
