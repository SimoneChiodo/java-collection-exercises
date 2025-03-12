package org.exercise.autoboxing;

public class autoboxingExercise {
  /*Esercizio 9: Autoboxing e Unboxing con Integer

  Dichiarare una variabile di tipo int e assegnargli un valore.
  Convertire automaticamente il valore in un oggetto Integer (autoboxing).
  Estrai il valore primitivo da un oggetto Integer (unboxing). */

  public static void main(String[] args) {
    int number = 5;
    Integer wrapNumber = number;
    int numberUnboxed = wrapNumber;
    System.out.println("\n"+number);
    System.out.println(wrapNumber);
    System.out.println(numberUnboxed);
  }
}
