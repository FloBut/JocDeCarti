package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int noOfPlayers;//numarul de jucatori
    private List<Card> setOfCards;//lista de carti care este definita in clasacard si este returnata de metoda getDeckCards()
    private List<Player> players;//o lista de jucatori

    public Game(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
        this.setOfCards = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public void addPlayer(Player player) {
        players.add(player);
    }

    public void deal(){

    }

    public void play() {

    }

}
