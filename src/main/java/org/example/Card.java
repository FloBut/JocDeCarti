package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
    private  final List<Integer> numbers;
    private final List<String> symbols;
    private static List<String> deckCards; // lista cu carti

    public Card() {
        this.numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        this.symbols = List.of("Hearts", "Spades", "Diamonds", "Clubs");
    }


    private static void initializeDeck() {
        deckCards = new ArrayList<>();
        generateCards();
        shuffleCards();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<String> getSymbols() {
        return symbols;
    }

    // adaug in lista de carti fiecare carte cu simbolul ei
    public static void generateCards() {
        Card cardInstance = new Card(); //pentru a aceesa campurile non statice in metoda statica
        List<Integer> numbers = cardInstance.getNumbers();// creez instante ale clasei
        List<String> symbols = cardInstance.getSymbols();// daca le fac statice imi da eroare in clasa pocj
        for (int number : numbers) {
            for (String symbol : symbols) {
                deckCards.add(number + " of " + symbol);
            }
        }
    }

    // amestecam cartile
    public static void shuffleCards() {
        Collections.shuffle(deckCards);
    }

    // returnez pachetul de carti amestecate
    public static List<String> getDeckCards() {
        if (deckCards == null || deckCards.isEmpty()) {
            initializeDeck();
        }
        return deckCards;
    }

    // vreau valoare intreaga a fiecarui numar din carte din setul de carti amestecate
    public int getValueIntOfCard() {
        String[] value = deckCards.get(0).split(" of ");
        String cardNo = value[0];
        return Integer.parseInt(cardNo);
    }
        public Card drawCard() {
            if (!deckCards.isEmpty()) {
                return new Card(deckCards.remove(0));
            } else {
                // if the deck is empty
                return null;
            }
        }
        //sugestia ai pentru eraoare :
    public Card(String drawnCard) {
        String[] parts = drawnCard.split(" of ");
        String numberPart = parts[0];
        String symbolPart = parts[1];

        // salveaza numarul si simbolul
        int number = Integer.parseInt(numberPart);
        String symbol = symbolPart;

        // lista de numere si lista de simboluri
        this.numbers = List.of(number);
        this.symbols = List.of(symbol);
    }
}