package org.exercise.list;

import java.util.LinkedList;

public class LinkedListExercise {
  /*Esercizio 5: LinkedList e operazioni tipiche

  Crea una LinkedList<Integer> e aggiungi 5 numeri.
  Usa i metodi addFirst() e addLast() per aggiungere numeri in testa e in coda.
  Usa removeFirst() e removeLast() per rimuovere elementi.
  Ottieni il primo e l’ultimo elemento con getFirst() e getLast(). */

  public static void main(String[] args) {
    // Creo la LinkedList
    LinkedList<Integer> interi = new LinkedList<>();
    interi.add(1);
    interi.addFirst(5);
    interi.addLast(9);
    System.out.println(interi);

    // Rimuovo il primo e l'ultimo elemento
    interi.removeFirst();
    System.out.println("Senza il primo: " + interi);
    interi.removeLast();
    System.out.println("Senza l'ultimo: " + interi);
    
    // Resetto la LinkedList
    interi.addFirst(5);
    interi.addLast(9);
    System.out.println("Reset della LinkedList");

    // Prelevo il primo e l'ultimo elemento
    System.out.println("Primo elemento: " + interi.getFirst());
    System.out.println("Ultimo elemento: " + interi.getLast());
  }
}
