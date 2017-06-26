/**
 * 
 */
package edu.cnm.deepdive.cards;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 * Single deck, 52 cards.
 * 
 * @author Kelly Escobar
 *
 */
public class Deck {

  private ArrayList<Card> cards = new ArrayList<>();
  private boolean shuffled = false;
  private Random rng = null;
  private int position = 0;
 
  /** Assigns suit and rank to cards. */
  public Deck() {
    super();
    cards = new ArrayList<>();
    for (Card.Suit suit : Card.Suit.values()) {
      for (Card.Rank rank : Card.Rank.values()) {
        Card card = new Card(suit, rank);
        cards.add(card);
      }
    }
  }
  
  /**
   * Uses secure shuffle method.
   *  
   * @throws NoSuchAlgorithmException
   */
  public void shuffle() 
      throws NoSuchAlgorithmException {
    if (rng == null) {
      rng = SecureRandom.getInstanceStrong();
    }
    Collections.shuffle(cards, rng);
    shuffled = true;
    position = 0;
  }
  /**
   * Creates an array with each card in the deck in the current order.
   * 
   * @return
   */
  public Card[] toArray() {
    return cards.toArray(new Card[] {});
  }
 
  /**
   * Retains position of each card in the deck (before or after a secure shuffle).
   * 
   * @return
   * @throws IndexOutOfBoundsException No cards are left in the deck.
   */
  public Card draw() 
      throws IndexOutOfBoundsException {
    return cards.get(position++);
  }
  
  /**
   * Draws and returns the top set number of cards from the deck.
   * 
   * @param numCards
   * @return
   * @throws IndexOutOfBoundsException
   */
  public Card[] draw(int numCards) 
      throws IndexOutOfBoundsException {
    Card[] hand = new Card[numCards];
    for (int i = 0; i < hand.length; i++) {
      hand[i] = draw();
    }
    return hand;
  }
  
  
}







