package com.repasogeneral.tallerpoo;

public class User {

    String nameUser;
    double price;
    String date;
    String city;
    double discount;
    int randomValue;
    String color;

    public User() {
        this.nameUser = "";
        this.price = 0;
        this.date = "";
        this.city = "";
        this.discount = 0;
        this.randomValue = 0;
        this.color = "";
    }

    public User(String nameUser, double price, String date, String city, double discount, int randomValue, String color) {
        this.nameUser = nameUser;
        this.price = price;
        this.date = date;
        this.city = city;
        this.discount = discount;
        this.randomValue = randomValue;
        this.color = color;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(int randomValue) {
        this.randomValue = randomValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
