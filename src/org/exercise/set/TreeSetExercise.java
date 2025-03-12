package org.exercise.set;

import java.util.TreeSet;

public class TreeSetExercise {

  /* Esercizio 3: TreeSet e ordinamento naturale

  Crea un TreeSet<Double> e aggiungi alcuni numeri decimali.
  Stampa il set e osserva l’ordinamento automatico.
  Usa i metodi first(), last(), higher(), lower() per esplorare gli elementi. */

  public static void main(String[] args) {
    TreeSet<Double> numbers = new TreeSet<>();
    numbers.add(22.22d);
    numbers.add(17.25);
    numbers.add(18.99);
    System.out.println("Normale: " + numbers);
    System.out.println(".first(): " + numbers.first());
    System.out.println(".last(): " + numbers.last());
    System.out.println(".higher() di \"10\": " + numbers.higher(10d));
    System.out.println(".lower() di \"17.5\": " + numbers.lower(20.19));

  }
}
