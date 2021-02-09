package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author(modifier) Gargi Mattoo
 * Student Number: 991618635
 */

public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //create an array to hold 7 cards
        Card[] magicHand = new Card[7]; 
        
        //use Random to generate random numbers
        Random random = new Random(); 
 
        for(int i = 0; i < magicHand.length; i++) {
            int value = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(4)];
            
            Card card = new Card(value, suit);
            magicHand [i] = card;

            //card.setValue(insert call to random number generator here)
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //print them out for debugging purposes 
        System.out.println("Here are 7 cards in my hand: ");
        for (Card card: magicHand) {
            System.out.printf("%d of %s\n", card.getValue(), card.getSuit());
        }
        
        //now ask user for Card value and suit, create their card
        System.out.print("Pick a card, any card (1 - 13): ");
        int value = input.nextInt();
        System.out.print("Pick a suit for your card: ");
        int suit = input.nextInt();
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }

        Card guess = new Card(value, Card.SUITS[suit - 1]);
        
        //and search magicHand here
        boolean match = false;
            for (Card card: magicHand) {
                if (card.getValue() == guess.getValue()
                    && card.getSuit().equals(guess.getSuit())) {
                   match = true;
                   break;
            }
        }
         
        //Then report the result here    
        String response = match ? "Your card is in the magic hand!": "Sorry, but your card is not in the magic hand :(";
        System.out.println(response);
    }
    
}
