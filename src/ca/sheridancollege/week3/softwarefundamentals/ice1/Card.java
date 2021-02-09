package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author(modifier) Gargi Mattoo
 * Student Number: 991618635
 */

public class Card {
    
    private int value;//1-13
    private String suit; //clubs, spades, diamonds, hearts
    
    public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    } 
}
