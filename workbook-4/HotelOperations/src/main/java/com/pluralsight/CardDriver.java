package com.pluralsight;


import java.util.ArrayList;
import java.util.Scanner;

public class CardDriver {
    static ArrayList<Card> cards;
    static ArrayList<Card> deck;

    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();
        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();
//Deal Cards
        for (int i = 0; i < 2; i++) {
            // get a card from the deck:
            Card card = deck.dealCard();
            //deal that card to the hand:
            playerHand.addCard(card);

            System.out.println("Player Hand: ");
            playerHand.display();
            System.out.println("Hand Value: " + playerHand.getValue());

            for (i = 0; i < 2; i++) {
                // get a card from the deck:
                Card card1 = deck.dealCard();
                //deal that card to the hand:
                dealerHand.addCard(card1);

                // playerHand.addCard(deck.dealCard());
                //dealerHand.addCard(deck.dealCard());
                //playerHand.addCard(deck.dealCard());
                // dealerHand.addCard(deck.dealCard());



                System.out.println("Dealer Hand: ");
                dealerHand.display();
                System.out.println("Hand Value: " + dealerHand.getValue());

                //Player turn
                while (playerHand.getValue() < 21) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("\n Hit or Stand? (h/s): ");
                    String choice = scanner.nextLine().trim().toLowerCase();
                    if (choice.equals("h")) {
                        playerHand.addCard(deck.dealCard());
                        System.out.println("\nYour Hand: ");
                        playerHand.display();
                        System.out.println("Hand Value: " + playerHand.getValue());
                    } else if (choice.equals("s")) {
                        break;
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
                //dealer
                while (dealerHand.getValue() < 17) {
                    dealerHand.addCard(deck.dealCard());
                }
//Display final hands
                System.out.println("\nYour final hand: ");
                playerHand.display();
                System.out.println("Hand Value: " + playerHand.getValue());

                System.out.println("\nDealer Hand: ");
                dealerHand.display();
                System.out.println("Hand Value: " + dealerHand.getValue());

                //Determine Winner
                int playerValue = playerHand.getValue();
                int dealerValue = dealerHand.getValue();
                if (playerValue > 21) {
                    System.out.println("\nBust! Dealer Won!");
                } else if (dealerValue > 21) {
                    System.out.println("\nDealer Bust! You Win!");
                } else if (playerValue < dealerValue) {
                    System.out.println("\nDealer Wins!");
                } else if (playerValue > dealerValue) {
                    System.out.println("\n You Win!");
                } else {
                    System.out.println("\nIt,s a tie.");
                }

                //deal 5 cards:
                // for(int i=0 ; i<5 ; i++){
                // get a card from the deck:
                // Deck card = hand.deal(deck);
                //deal that card to the hand:
                //hand.deal(card);
            }
            // int handValue = hand.getValue();
            //  System.out.println("This hand is worth "+handValue);
            // }
        }
    }
}
