package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {

   private  List<Integer> numbers ; //lista in care pun numarul cartilor
   private  List<String> symbols ; //lista in care pun simbolul cartilor
   private  List<String> deckCards;//lista cu carti

    public Card(List<Integer> numbers, List<String> symbols) {
        this.numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        this.symbols = List.of("Hearts","Spades", "Diamonds","Clubs");
        this.deckCards = new ArrayList<>();
        generateCards();

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

    //adaug in lista deckCards pentru cele 52 de carti fiecare numar de carte cu simbolul ei
    public void generateCards() {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j <symbols.size(); j++) {
                deckCards.add(numbers.get(i) + "of" + symbols.get(j));
            }
        }
    }

    //amestec cartile
    public void shuffleDeck() {
        Collections.shuffle(deckCards);

    }
    public List<String> getDeckCards() {
        return deckCards;
    }





}
