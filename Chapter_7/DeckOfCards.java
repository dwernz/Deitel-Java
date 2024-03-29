package Chapter_7;

// Fig. 7.12: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards
import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck; // array of Card objects
    private int currentCard; // index of next Card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
    // random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();

    // constructor fills deck of Cards
    public DeckOfCards() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs" };

        deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
        currentCard = 0; // first Card dealt with be deck[0]

        // populate deck with Card objects
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        } // end for loop
    } // end constructor DeckOfCards

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle() {
        // next call to method dealCard should start at deck[0] again
        currentCard = 0;

        // for each Card, pick another random Card (0 - 51) and swap them
        for (int first = 0; first < deck.length; first++) {
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        } // end for loop
    } // end method shuffle

    // deal one Card
    public Card dealCard() {
        // determine whether Cards remain to be dealt
        if (currentCard < deck.length) {
            return deck[currentCard++]; // return current Card in array
        } // end if statement
        else {
            return null; // return null to indicate that all Cards were dealt
        } // end else statement
    } // end method dealCard
} // end class DeckOfCards
