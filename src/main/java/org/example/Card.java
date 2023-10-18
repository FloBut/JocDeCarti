package org.example;

import java.util.ArrayList;
import java.util.List;

public class Card {

   private  List<Integer> numbers ;
   private  List<String> symbols ;

    public Card(List<Integer> numbers, List<String> symbols) {
        this.numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        this.symbols = List.of("Hearts","Spades", "Diamonds","Clubs");
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
}
