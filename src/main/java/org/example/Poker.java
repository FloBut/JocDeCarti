package org.example;

public class Poker extends Game {
   private int numberOfPlayers = 4;

   public Poker(int noOfPlayers) {
      super(noOfPlayers);
   }

   @Override
   public void deal() {
      super.deal();
   }

   @Override
   public void play() {
      super.play();
   }
   //Pentru Poker se distribuie cate 8 carti fiecarui jucator si castiga jucatorul cu cea mai mare carte.
}
