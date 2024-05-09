package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

import static com.pluralsight.Hand.cards;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "J", "Q", "K", "A"};
        // these loops create all the cards in the deck
        // and add them to the ArrayList
        for (String suit : suits) {
            for (String value : values) {
                //deck.add(new Card(suit,value));
               Card card = new Card(suit, value);
              deck.add(card);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }
    public Card dealCard(){
        if (deck.isEmpty()){
            throw new IllegalStateException("The deck is empty");
        }
        return deck.remove(deck.size() - 1);
    }
}
