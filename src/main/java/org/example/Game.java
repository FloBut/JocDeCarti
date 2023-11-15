package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int noOfPlayers;//numarul de jucatori
    private List<Card> setOfCards;//lista de carti care este definita in clasacard si este returnata de metoda getDeckCards()
    private List<Player> players;//o lista de jucatori

    public Game(int noOfPlayers, List<Player> players) {
        this.noOfPlayers = noOfPlayers;
        this.setOfCards = setOfCards;
        this.players = new ArrayList<>(players);
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public void deal(){
        System.out.println("Dealing cards...");

    }

    public void play() {
        System.out.println("Playing the game...");

    }
    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }
    public List<Player> getPlayers() {
        return players;
    }

}