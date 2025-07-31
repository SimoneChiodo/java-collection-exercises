# Esercizi Java Collection Framework

Questa serie di esercizi serve a consolidare la conoscenza delle collezioni in Java, coprendo Set, List, Map, Autoboxing/Unboxing e Iterator.

---

## Set (HashSet, LinkedHashSet, TreeSet)

**Esercizio 1: HashSet**
- Crea un `HashSet` con almeno 5 nomi di città.
- Stampa il set e osserva l’ordine (non garantito).
- Controlla se un elemento esiste.
- Rimuovi un elemento e verifica.
- Itera con un `Iterator`.

**Esercizio 2: LinkedHashSet**
- Crea un `LinkedHashSet` con numeri 10, 5, 30, 20, 15.
- Stampa il set e verifica che mantenga l’ordine di inserimento.
- Aggiungi un numero già presente e osserva il comportamento.

**Esercizio 3: TreeSet**
- Crea un `TreeSet` con numeri decimali.
- Stampa il set e verifica l’ordinamento naturale.
- Usa i metodi `first()`, `last()`, `higher()`, `lower()` per esplorare gli elementi.

---

## List (ArrayList, LinkedList)

**Esercizio 4: ArrayList**
- Crea un `ArrayList` con 5 nomi di frutta.
- Ordina la lista con `Collections.sort()`.
- Rimuovi un elemento e stampa la lista.
- Itera con un ciclo `for` e con un `Iterator`.

**Esercizio 5: LinkedList**
- Crea una `LinkedList` con 5 numeri.
- Usa `addFirst()` e `addLast()` per aggiungere elementi in testa e coda.
- Usa `removeFirst()` e `removeLast()` per rimuovere elementi.
- Recupera primo e ultimo elemento con `getFirst()` e `getLast()`.

---

## Map (HashMap, LinkedHashMap, TreeMap)

**Esercizio 6: HashMap**
- Crea un `HashMap<String, Integer>` con nomi studenti e voti.
- Aggiungi almeno 5 coppie chiave-valore.
- Controlla la presenza di una chiave.
- Stampa tutte le chiavi e tutti i valori.
- Scorri la mappa con un `Iterator`.

**Esercizio 7: LinkedHashMap**
- Crea un `LinkedHashMap<String, String>` con paesi e capitali.
- Aggiungi almeno 5 coppie.
- Stampa la mappa mantenendo l’ordine di inserimento.
- Aggiungi una coppia già presente e osserva cosa succede.

**Esercizio 8: TreeMap**
- Crea un `TreeMap<Integer, String>` con ID prodotto e nome prodotto.
- Aggiungi almeno 5 elementi.
- Stampa la mappa e verifica l’ordinamento automatico.
- Usa `firstEntry()` e `lastEntry()` per ottenere primo e ultimo elemento.

---

## Autoboxing e Unboxing

**Esercizio 9: Integer**
- Dichiara una variabile `int` e assegna un valore.
- Dimostra l’autoboxing in un oggetto `Integer`.
- Estrai il valore primitivo da un `Integer` (unboxing).

---

## Iterator

**Esercizio 10: Iterator con ArrayList**
- Crea un `ArrayList` con 5 nomi di animali.
- Usa un `Iterator` per stampare gli elementi.
- Usa l’`Iterator` per rimuovere un elemento specifico.

---
