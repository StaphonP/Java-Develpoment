package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    static ArrayList<Card> cards;
   // static ArrayList<Card> deck;

    public Hand()
    {
      //  deck = new ArrayList<>();
        cards = new ArrayList<>();
    }
    public void addCard(Card card){
        cards.add(card);

    }

    public int getSize(){
        return cards.size();
    }

    public int getValue(){
        int value = 0;
        for(Card card : cards){
            card.flip();
            value+= card.getPointValue();
            card.flip();//hide the card again
        }
        System.out.println(value);
        return value;
    }
    public void display(){
        System.out.println(cards);
    }
}
