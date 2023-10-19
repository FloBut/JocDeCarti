package org.example;

import java.util.*;

//Pentru jocul de BlackJack se distribuie cate 5 carti fiecarui jucator
// si castiga jucatorul care are suma cartilor cea mai apropiata de 21.

//clasa va extinde game deci are un numar de jucatori si va suprascrie metodele deal si play
public class BlackJack extends Game{
    public BlackJack(int noOfPlayers) {
        super(noOfPlayers);
    }


//am numarul de carti pentru fiecare jucator
    //pentru fiecare jucator ar trebui sa ii dau cate 5 carti, cum fac asta? cu o mapa - >
        // pun numele jucatorlui - cheie  si lista de carti va fi valoarea

    @Override
    public void deal() {
        int cardsDeal = 5;//numarul de carti distribuit pentru fiecare jucator
        Map<Player, List<Card>> dealPlayer = new HashMap<>();
        //pentru fiecare jucator din mapa ar trebui sa pun o lista de carti deci mai intai tre fac list de carti
        List<Card> cardsForPlayers = new ArrayList<>();
        //tre sa adaug cate 5 carti
            // fie din clasa Card din metoda getDeckCard care imi da cartile amestecate si sa le  pun in lista - > cum fac asta?
            // fie sa iau primele 5 carti din lista de carti care  oricum sunt amestecate si sa le pun in lista  -> cum fac asta?
        for (int i = 0; i < cardsDeal; i++) {
            cardsForPlayers.add()
        }

        //apoi pentru fiecare din noOfPlayers sa pun in mapa numele lui si lista coonstruita mai sus -> cum fac asta?

    }


    //// castiga jucatorul care are suma cartilor cea mai apropiata de 21.
    @Override
    public void play() {
        super.play();
    }
}
