package com.lesson17.EnumCardSuit;

public class CardDeck {
    public static void main(String[] args) {

        for (CardSuit suit : CardSuit.values()) {
            System.out.printf("Card suit: %s, Color: %s\n", suit, suit.getColor());
        }
    }
}
