/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *A Simple file to model card Glass
 * @author Gaurav, May 15 2019
 */
public class CardGame {

    private String suit; //hearts,spades,clubs,dimonds
    private int value; //1-13

    public CardGame(String suit, int value) {
        if(suit.equalsIgnoreCase("Hearts") || suit.equalsIgnoreCase("Spades") || suit.equalsIgnoreCase("Clubs") || suit.equalsIgnoreCase("Dimonds")){
            this.suit = suit;
        }else{
            System.out.println("Invalid Suit, Try Again");
        }
        
        if(value <1 || value >13){
            System.out.println("Invalid Value");
        }else{
            this.value= value;
        }
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
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    
    
}
