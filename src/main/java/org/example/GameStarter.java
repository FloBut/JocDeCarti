package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameStarter {


//Pentru pornirea jocurilor se creeaza o clasa GameStarter
    // care contine metoda de start in interiorul careia se fac
    // declararile si initializarile pentru un anumit joc.

    //  //cum impart cartile
    //    //La impartirea cartilor(deal) se distribuie fiecarui jucator un subset de carti
    //    // din setul predefinit al jocului curent astfel ca se genereaza pentru fiecare player(cheie)
    //    // un set de carti aleator(valoare).
    //        //mi ar trebui o mapa in care pentru fiecare nume de jucator
    //        - care va fi cheia sa am o lista de carti - valorile
    public void startBlackJackGame() {

        Player player1 = new Player("Costel");
        Player player2 = new Player("Mirel");
        BlackJack blackJack = new BlackJack(Arrays.asList(player1,player2));
        try {
            blackJack.deal();
            System.out.println(blackJack.play());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
   /* public void startPokerGame() {
        Deck.getDeckCards();
        if (players == null || players.isEmpty()) {
            System.out.println("No players to start the game.");
            return;
        }
        Poker poker = new Poker(players.size(), players);
        poker.deal();
        poker.play();
    }*/

}
