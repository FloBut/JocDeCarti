package org.example;

import java.util.*;

public class BlackJack extends Game {
        public BlackJack(List<Player> players) {
        super( players);

    }


    @Override
    public void deal() throws Exception {
        //parcurg fiecare jucator
        for (Player player: getPlayers()){
            //setez mana jucatorului cu 5 carti luate din setul de carti
            //atata timp cat suma curenta din mana jucatorului este mai mica sau egala decat 21
            while (player.getHandSumValue() <= 21){
                player.getHand().add(getSetOfCards().remove(0));
            }
            System.out.println("player hand: " + player.getName() + " " + player.getHand());
        }
    }


    @Override
    public String play() throws Exception {

        //calculez suma cartilor pentru fiecare jucator
        //vad care este suma mai mica sau egala decat 21 cu diferenta minima fata de 21
        Integer minDifference = Integer.MAX_VALUE;
        String winnerName = "";
        for (Player player: getPlayers()){
            Integer currentPlayerSum = player.getHandSumValue();
            System.out.println(player.getName() + " "+ player.getHandSumValue());
            if (currentPlayerSum <= 21 && 21 - currentPlayerSum < minDifference ){
                minDifference = 21 - currentPlayerSum;
                winnerName = player.getName();

            }
        }

        return winnerName;
    }


}