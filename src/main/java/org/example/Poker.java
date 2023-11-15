package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Pentru Poker se distribuie cate 8 carti fiecarui jucator
// si castiga jucatorul cu cea mai mare carte.
public class Poker extends Game {
    Map<Player, List<Card>> playerOnDeck;

    public Poker(int noOfPlayers,List<Player> players) {
        super(noOfPlayers, players);
        this.playerOnDeck = new HashMap<>();
    }

    // impart carile:
    // pentru fiecare jucator impart o lista de carti deci in mapa pun
    // jucatorul si lista lui de carti
    @Override
    public void deal() {
        int cardsDeal = 5;//numarul de carti pe care le impart
        Map<Player, List<Card>> cardsOnDeck = new HashMap<>();// mapa in care pun jucatorul si lista lui de carti

        //pentru fiecare jucator
        for (Player player : this.getPlayers()) {
            // imi trebuie lista de carti si o obtin cu metoda getDecCards
            List<Card> listOfCardsForPlayers = new ArrayList<>();

            //impart cartile
            for (int i = 0; i < cardsDeal; i++) {
                if (!Card.getDeckCards().isEmpty()) {
                    Card card = new Card();
                    listOfCardsForPlayers.add(card.drawCard());; // iau cate o carte din pachet
                     // fiecare carte o pun in lista de carti pentru jucator
                }
            }
            cardsOnDeck.put(player, listOfCardsForPlayers);
        }
        // actualizez mapa cu cartile impartite
        this.playerOnDeck = cardsOnDeck;
    }

    @Override
    public void play() {
        //trebuie sa am un jucator in joc
        if (this.getPlayers().isEmpty()) {
            System.out.println("No players in the game.");
            return;
        }
        //parcurg mapa in care am jucatorii si listele lor de carti
        //pentru fiecare lista de carti determin un maxim pentru cele 6 liste
        // de jucatori si numele lor
        //din cele 6  maximuri voi determina un maxim si numele jucatorului


        int highestCards = 0;
        Player nameOfWinner = null;;
        //parcurg mapa in care am jucatorii si lista lor de carti
        Map<Player, List<Card>> players = this.playerOnDeck;
        //pentru fiecare jucator parcurg lista lui de carti si aflu cartea cu valoarea cea mai mare
        for (Map.Entry<Player, List<Card>> entry: players.entrySet()) {
            // parcurg lista de carti din mapa
            for (Card card : entry.getValue()) {
                int noOfCard = card.getValueIntOfCard();//imi scot valoarea intreaga a cartii
                // si sa o compar cu restul valorilor din lista respectiva
                if (noOfCard >= highestCards) {
                    highestCards = noOfCard;
                    nameOfWinner = entry.getKey();

                }
            }
        }
            //aici afizez castigatorul
        if (nameOfWinner != null) {
            System.out.println("The winner is " + nameOfWinner.getName() + " with the highest card value of " + highestCards);
        } else {
            System.out.println("No winner found.");
        }
    }
}
