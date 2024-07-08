package com.example.echangeshopproject;

public class Share {
    private int price;
    private int amount;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    private User seller;
    private User buyer;

    public Share(User seller, User buyer, int price, int amount, int year, int month, int day, int hour, int minute) {
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.amount = amount;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public long getVal() {
        return (long) price * amount;
    }
}