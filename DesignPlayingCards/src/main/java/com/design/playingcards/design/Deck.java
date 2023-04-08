package com.design.playingcards.design;

import java.util.ArrayList;
import java.util.List;

public class Deck {

  List<Card> cardDeck;

  public Deck() {
    this.cardDeck = new ArrayList<>();
    for (int i = 2; i <= 10; i++) {
        cardDeck.add(new Card(i, Suite.CLUB));
        cardDeck.add(new Card(i, Suite.SPADE));
        cardDeck.add(new Card(i, Suite.DIAMOND));
        cardDeck.add(new Card(i, Suite.HEART));
    }
  }
}
