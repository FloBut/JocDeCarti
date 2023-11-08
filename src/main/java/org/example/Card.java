package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
    private List<Integer> numbers ; //lista in care pun numarul cartilor
    private  List<String> symbols ; //lista in care pun simbolul cartilor
    private static List<String> deckCards;//lista cu carti

    public Card() {
        this.numbers =  List.of(2,3,4,5,6,7,8,9,10,11,12,13,14);
        this.symbols = List.of("Hearts","Spades", "Diamonds","Clubs");
        this.deckCards = new ArrayList<String>();
        getDeckCards();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<String> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<String> symbols) {
        this.symbols = symbols;
    }
    //adaug in lista de carti  fiecare carte cu simbolul ei
    public void generateCards() {
        deckCards.clear();// lista de carti
        for (int number: numbers ) {
            for (String symbol: symbols) {
                deckCards.add(number +  "of"  + symbol);
            }
        }
    }
    //amestecam cartile
    public void shuffleCards() {
        Collections.shuffle(deckCards);
    }

    //returnez pachetul de carti amestecate
    public static List<String> getDeckCards() {
        if (deckCards == null) {
            deckCards = new ArrayList<>();
        }
        return deckCards;
    }

    //vreau valoare intreaga a fiecarui numar din carte din setul de carti amestecate
    public int getValueIntOfCard() {
        String[] value = deckCards.get(0).split(" of ");
        String cardNo = value[0];
        return Integer.parseInt(cardNo);
    }

    //imi mai trebuie o metoda care in care sa pun cartile pe care le -am scos pe masa


}
