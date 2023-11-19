package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {

    public List<Card> setOfCards;//lista de carti care este definita in clasacard si este returnata de metoda getDeckCards()
    public List<Player> players;//o lista de jucatori
    public Game(List<Player> players) {
        this.setOfCards = Deck.getDeckCards();
        this.players = players;
    }





    public abstract void deal() throws Exception;

    public abstract String play() throws Exception;
    public void addPlayer(Player player) {

        players.add(player);
    }

    public void removePlayer(Player player) {

        players.remove(player);
    }
    public List<Player> getPlayers() {

        return players;
    }

    public List<Card> getSetOfCards() {

        return setOfCards;
    }

    public void setSetOfCards(List<Card> setOfCards) {

        this.setOfCards = setOfCards;
    }
}