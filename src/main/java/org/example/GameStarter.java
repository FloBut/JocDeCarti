package org.example;

public class GameStarter {
    //Pentru pornirea jocurilor se creeaza o clasa GameStarter
    // care contine metoda de start in interiorul careia se fac
    // declararile si initializarile pentru un anumit joc.

    //  //cum impart cartile
    //    //La impartirea cartilor(deal) se distribuie fiecarui jucator un subset de carti
    //    // din setul predefinit al jocului curent astfel ca se genereaza pentru fiecare player(cheie)
    //    // un set de carti aleator(valoare).
    //        //mi ar trebui o mapa in care pentru fiecare nume de jucator - care va fi cheia sa am o lista de carti - valorile
    public void startGame() {
        BlackJack blackjackGame = new BlackJack(4);
        Poker pokerGame = new Poker(6);
    }
}
