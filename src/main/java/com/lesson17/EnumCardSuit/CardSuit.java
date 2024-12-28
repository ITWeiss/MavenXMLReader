package com.lesson17.EnumCardSuit;

public enum CardSuit {
    HEARTS("Red"), DIAMONDS("Red"), CLUBS("Black"), SPADES("Black");

    private final String color;

    CardSuit(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
