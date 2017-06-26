/**
 * 
 */
package edu.cnm.deepdive.cards;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hand implements number of cards from a specified deck.
 * 
 * @author Kelly Escobar
 *
 */
public class Hand implements Comparable<Hand> {

  private final Deck deck;
  private final int size;
  private final ArrayList<Card> cards;
  
 /**
  * Creates a new hand with a specified number of cards from a specified deck.
  * 
  * @param deck
  * @param size
  */
  public Hand(Deck deck, int size) {
    this.deck = deck;
    this.size = size;
    cards = new ArrayList<>(Arrays.asList(deck.draw(size)));
  }

  @Override
  public int compareTo(Hand o) {
    // TODO Auto-generated method stub
    return 0;
  }
  
  
}
