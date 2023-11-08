package org.example;

import java.util.ArrayList;
import java.util.List;

public class GameStarter {
    List<Player> players = new ArrayList<>();

    public GameStarter(List<Player> players) {
        this.players = players;
    }

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
        BlackJack blackJack = new BlackJack(players.size(), players);
        Card card = new Card();
        card.generateCards();
        card.shuffleCards();
        blackJack.deal();
        blackJack.play();
    }
    public void startPokerGame() {
        Poker poker = new Poker(players.size());
        Card card = new Card();
        card.generateCards();
        card.shuffleCards();
        poker.deal();
        poker.play();
    }

}
