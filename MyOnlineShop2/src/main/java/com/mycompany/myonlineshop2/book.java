package com.mycompany.myonlineshop2;
//this inerit class that inherits (implement) from product class that use  set and get methods 

public class book implements product {

    double price;  //variable defination

    public book(double price) {   // this is constractor to define class
        this.price = price;
    }

    @Override
    public void setPrice(double price) { //this set method that pass the price to it
        this.price = price;

    }

    @Override

    public double getPrice() { //this get method that return the price mult. in 0.5
        return (price * 0.5);

    }
}
