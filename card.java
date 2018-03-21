package com.company;
/*
adam campbell
b00707378
this is the card class, a card has a suit and a value
 */
public class card {

    private static String[] suits = {"spades", "hearts","clubs", "diamonds"};
    private static String[] name = {"2","3","4","5","6","7","8","9","10","Jack","Queen", "King", "Ace"};
    private int value;

    public card(int q){
        value =q;
    }

    //the remainder divided by 13 is the value of the card because each multuple of 13 goes through a suit
    public int getValue(){
        return value%13;
    }

    //prints the card suit and value
    public String toString(){
        String temp = "";
        temp+= name[value%13] + " of ";
        temp+= suits[value/13];
        return temp;
    }
}
