/**
 * 
 */
package edu.cnm.deepdive.cards;

/**
 * @author Kelly Escobar
 *
 */
public class Card implements Comparable<Card> {

  public final Suit suit;
  public final Rank rank;

  /**
   * 
   * @param suit Suit of new Card object.
   * @param rank Rank of new Card object.
   */
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  @Override
  public String toString() {
    return rank.toString() + suit.toString();
  }

  @Override
  public int compareTo(Card card) {
    int suitComparison = this.suit.compareTo(card.suit); 
    if (suitComparison != 0) {
      return suitComparison;
    }
    return this.rank.compareTo(card.rank);
  }

  /**
   * Sets the value of 4 card suits.
   * 
   * @author Kelly Escobar
   *
   */
  public enum Suit {
    CLUBS, 
    DIAMONDS, 
    HEARTS, 
    SPADES;

    @Override
    public String toString() {
      String value = null;
      switch (this) {
        case CLUBS:
          value = "\u2663";
          break;
        case DIAMONDS:
          value = "\u2666";
          break;
        case HEARTS:
          value = "\u2665";
          break;
        case SPADES:
          value = "\u2660";
          break;
      }
      return value;
    }
  }

  /**
   * Assigns value and return name to each card.
   * 
   * @author Kelly Escobar
   *
   */
  public enum Rank {
    ACE(1, 'A'), 
    TWO(2, '2'), 
    THREE(3, '3'), 
    FOUR(4, '4'), 
    FIVE(5, '5'), 
    SIX(6, '6'), 
    SEVEN(7,'7'), 
    EIGHT(8,'8'), 
    NINE(9, '9'), 
    TEN(10, 'T') {
      @Override
      public String toString() {
        return "10";
      }
    }, 
    JACK(10, 'J'), 
    QUEEN(10, 'Q'), 
    KING(10, 'K');

    /**
     * Sets value and symbol allowed for each card.
     */
    public final int value;
    public final char symbol;

    private Rank(int value, char symbol) {
      this.value = value;
      this.symbol = symbol;
    }
    
    @Override
    public String toString() {
      return new StringBuilder().append(symbol).toString();
      }

    }

  }





