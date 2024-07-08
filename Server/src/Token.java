package com.example.echangeshopproject;

public class Token {
    private String name;

    private int[][][][][] prices = new int[5 + 1][12 + 1][31 + 1][24 + 1][60 + 1];

    private long totalVal;

    private Share[] shares = new Share[1000000];

    private int shareCount;

    public Token(String name) {
        this.name = name;
    }

    public void setNewPrice(int price, int year, int month, int day, int hour, int minute) {
        prices[year][month][day][hour][minute] = price;
    }

    public void setNewShare(User seller, User buyer, int amount, int year, int month, int day, int hour, int minute) {
        shares[shareCount] = new Share(seller, buyer, prices[year][month][day][hour][minute], amount,year, month, day, hour, minute);
        totalVal += shares[shareCount].getVal();
        shareCount++;
    }
}