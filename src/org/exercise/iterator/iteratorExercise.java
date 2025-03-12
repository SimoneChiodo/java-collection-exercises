package org.exercise.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class iteratorExercise {
  /*Esercizio 10: Uso di Iterator con ArrayList

  Crea un ArrayList<String> e inserisci 5 nomi di animali.
  Usa un Iterator per scorrere la lista e stampare gli elementi.
  Usa l’Iterator per rimuovere un elemento specifico. */

  public static void main(String[] args) {
    // Creo l'ArrayList
    ArrayList<String> animals = new ArrayList<>();
    animals.add("Tigre");
    animals.add("Leone");
    animals.add("Gazzella");
    animals.add("Giaguaro");
    animals.add("Pantera");
    System.out.println(animals);
    
    // Mostro gli animali con Iterator
    Iterator<String> iterator = animals.iterator();
    System.out.println("Stampa elementi con Iterator");
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

    // Chiedo all'utente di rimuovere un animale
    System.out.println("Rimuovi un elemento: ----------");
    Scanner scanner = new Scanner(System.in);
    String animalToDelete = scanner.next();
    scanner.close();

    // Rimuovo l'animale scelto con Iterator
    System.out.println("Rimozione animale scelto ----------");
    Iterator<String> iterator2 = animals.iterator();
    while(iterator2.hasNext()){
      if(iterator2.next().equals(animalToDelete))
        iterator2.remove();
    }
    System.out.println(animals);
  }
}
