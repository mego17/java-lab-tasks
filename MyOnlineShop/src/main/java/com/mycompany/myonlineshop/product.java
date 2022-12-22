package com.mycompany.myonlineshop;
//this abstract class that has two methods that they methods can have body

abstract public class product {

    protected double price; //variable defination use in method

    public void setPrice(double price) { //this set method that pass the price to it
        this.price = price;
    }

    public abstract double getPrice(); //this method is get

}
