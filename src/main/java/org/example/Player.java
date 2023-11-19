package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;

    private List<Card> hand;


    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    public Integer getHandSumValue() throws Exception {
        return hand.stream()
                .map(c -> c.getNumber())
                .reduce(0,(sum, value)-> sum+value);

    }
}
