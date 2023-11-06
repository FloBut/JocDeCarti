package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
    private List<Integer> numbers ; //lista in care pun numarul cartilor
    private  List<String> symbols ; //lista in care pun simbolul cartilor
    private static List<String> deckCards;//lista cu carti

    public Card(List<Integer> numbers, List<String> symbols) {
        this.numbers =  List.of(2,3,4,5,6,7,8,9,10,11,12,13,14);
        this.symbols = List.of("Hearts","Spades", "Diamonds","Clubs");
        this.deckCards = new ArrayList<String>();
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
        for (int i = 0; i < numbers.size();i++) {
            for (int j = 0; j < symbols.size(); j++) {
                deckCards.add(numbers.get(i) +  "of"  + symbols.get(j));
            }
        }
    }
    //amestecam cartile
    public void shuffleCards() {
        Collections.shuffle(deckCards);
    }

    //returnez pachetul de carti amestecate
    public static List<String> getDeckCards() {
        return deckCards;
    }

    //vreau valoare intreaga a fiecarui numar din carte din setul de carti amestecate
    public int getValueIntOfCard(Card card) {
        List<String> cards = deckCards;
        int valuOfCard = 0;//declar o var de tip int
        for (int i = 0; i < cards.size(); i++) {//parcurg lista de carti
            String[] value = cards.get(i).split("of"); // scot intr un array de stringuri fiecare carte
            String cardNo = value[0];// prima valoare din array o pun intr un string
            valuOfCard = Integer.parseInt(cardNo);// acum scot partea intreaga din string
            break;
        }
       return valuOfCard;
    }

    //imi mai trebuie o metoda care in care sa pun cartile pe care le -am scos pe masa


}
