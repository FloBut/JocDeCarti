package org.example;

import java.util.*;

import static org.example.Card.getDeckCards;

public class BlackJack extends Game {
    private Map<Player, List<Card>> dealtCards; //imi trebuie o mapa pe care sa o folosesc in metoda play()

//Pentru jocul de BlackJack se distribuie cate 5 carti fiecarui jucator
// si castiga jucatorul care are suma cartilor cea mai apropiata de 21.

//clasa va extinde game deci are un numar de jucatori si va suprascrie metodele deal si play

    public BlackJack(int noOfPlayers) {
        super(noOfPlayers);
        this.dealtCards = new HashMap<>(); //
    }
    public Map<Player, List<Card>> getDealtCards() {
        return this.dealtCards;
    }
    //am numarul de carti pentru fiecare jucator
    //pentru fiecare jucator ar trebui sa ii dau cate 5 carti, cum fac asta?
    // cu o mapa - >
    // pun numele jucatorlui - cheie  si lista de carti va fi valoarea

    @Override
    public void deal() {
        int cardsDeal = 5;
        Map<Player, List<String>> dealCards = new HashMap<>();
        //pentru fiecare jucator din mapa ar trebui sa pun o lista de carti
        // deci mai intai tre fac lista de carti
        //cum scot lista de carti din clasa card ?
        List<String> cardsAll = getDeckCards();// apelez metoda care imi returneaza lista de carti amestecata

        //pentru fiecare jucator din lista de jucatori -> cum accesez lista de jucatori
        // imi pun lista de carti
        // accesez lista de jucatori din clasa Game
        for (Player nameOfPlayer : this.getPlayers()) {
            List<String> cardsForPlayer = new ArrayList<>();
            for (int i = 0; i < cardsDeal; i++) {
                //pentru fiecare jucator imi creez o lista de carti o lista de carti
                if (!(Card.getDeckCards().isEmpty())) {
                    String dealtCards = cardsAll.remove(0);//imi iau cate o carte din pachetul de carti
                    cardsForPlayer.add(dealtCards); //fiecare carte luata o pun in lista pentru jucatorul curent
                } else {
                    System.out.println("Deck is empty");
                    break;
                }
            }
        //acum pun si in mapa numele jucatorului si lista de carti
            dealCards.put(nameOfPlayer, cardsForPlayer);
        }



    }

    //// castiga jucatorul care are suma cartilor cea mai apropiata de 21.
//iau fiecare mapa returnata de metoda de mai sus si calculez un maxim si returez
// cheia corespunazatore maximului
    @Override
    public void play() {
        //daca lista de jucatori e goala nu am cu cine juca
        if (this.getPlayers().isEmpty()) {
            System.out.println("No player in the game");
            return;
        }
        Map<Player, List<Card>> findWinner = this.getDealtCards();
        int maxScore = 0;// declar o var in care voi pune maximul
        Player winnerName = null;// aici voi pune numele casticatorului
        //parcurg mapa cu jucatorul si lista lui de carti
        for (Map.Entry<Player, List<Card>> entry: findWinner.entrySet()) {
            // fac suma pentru cartile pe care le are
           int sum = 0;
            //pentru fiecare carte tre sa imi scot numarul din carte deorece cartea este
            // alcatuita din numar si tipul ei
            for (Card card: entry.getValue()) {
               int no = card.getValueIntOfCard(card);//apelez metoda in care imi scot valoare intreaga din carte
               sum += no;
           }
            if (sum >= 21 & sum >= maxScore) {
                maxScore = sum;
                winnerName = entry.getKey();
            }
        }
    }

    //Pentru Poker se distribuie cate 8 carti fiecarui jucator
    // si castiga jucatorul cu cea mai mare carte.
}
