package org.example;
//Dezvoltati o aplicatie Java pentru simularea jocurilor de carti:
//
//BlackJack
//Poker Pentru a juca este nevoie de jucatori(Player) care sunt caracterizati de nume.
//Pentru tipurile de joc, mai este nevoie de un set de carti(Card) care sunt caracterizate de:
//
//numar(1-15)
//simbol(rosu - hearts, negru - spades, romb - diamonds, trefla - clubs).
//Un joc este caraterizat de:
//
//Nr. de jucatori (BlackJack - maxim 6, Poker - maxim 4)
//setul de carti
//lista de jucatori
//Ambele jocuri au casi comporttamente comune:
//
//a juca (play)
//a imparti cartile(deal). Fiecare joc implementeaza diferit metodele play, deal.
//La impartirea cartilor(deal) se distribuie fiecarui jucator un subset de carti din setul predefinit al jocului curent astfel ca se genereaza pentru fiecare player(cheie) un set de carti aleator(valoare).
//
//Pentru jocul de BlackJack se distribuie cate 5 carti fiecarui jucator si castiga jucatorul care are suma cartilor cea mai apropiata de 21.
//
//Pentru Poker se distribuie cate 8 carti fiecarui jucator si castiga jucatorul cu cea mai mare carte.
//
//Pentru pornirea jocurilor se creeaza o clasa GameStarter care contine metoda de start in interiorul careia se fac declararile si initializarile pentru un anumit joc.
//
//Daca se incearca inceperea unui joc u un numar mai mare de jucatori decat cel suportat de jocul respectiv, se genereaza o exceptie NoOfPlayersNotSuportedException
//
//Totodata sa se creeze o clasa de test pentru diferite scenarii ale metodei play.
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
}