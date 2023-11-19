package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static final List<Integer> numbers =  List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
    private static final List<String> symbols = List.of("Hearts", "Spades", "Diamonds", "Clubs");;
    private static List<Card> deckCards; // lista cu carti

    private static void initializeDeck() {
        deckCards = new ArrayList<>();
        generateCards();
    }

    public List<Integer> getNumbers() {

        return numbers;
    }

    public List<String> getSymbols() {

        return symbols;
    }

    // adaug in lista de carti fiecare carte cu simbolul ei
    public static void generateCards() {
        for (int number : numbers) {
            for (String symbol : symbols) {
                deckCards.add(new Card(number,symbol));
            }
        }
    }

    // amestecam cartile
    public static void shuffleCards() {
        Collections.shuffle(deckCards);
    }

    // returnez pachetul de carti amestecate
    public static List<Card> getDeckCards() {
        if (deckCards == null || deckCards.isEmpty()) {
            initializeDeck();
        }
        shuffleCards();
        return deckCards;
    }

    // vreau valoare intreaga a fiecarui numar din carte din setul de carti amestecate
    /*public int getValueIntOfCard() {
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

     */
        //sugestia ai pentru eraoare :
   /* public Card(String drawnCard) {
        String[] parts = drawnCard.split(" of ");
        String numberPart = parts[0];
        String symbolPart = parts[1];

        // salveaza numarul si simbolul
        int number = Integer.parseInt(numberPart);
        String symbol = symbolPart;

        // lista de numere si lista de simboluri
        numbers = List.of(number);
        symbols = List.of(symbol);
    }*/
}