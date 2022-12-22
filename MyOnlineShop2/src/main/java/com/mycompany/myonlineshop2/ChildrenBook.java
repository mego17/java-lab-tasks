package com.mycompany.myonlineshop2;
//this inerit class that inherits (implement) from product class that use  set and get methods 

public class ChildrenBook implements product {

    double price;//variable defination

    public ChildrenBook(double price) {// this is constractor to define class
        this.price = price;
    }

    @Override

    public void setPrice(double price) {//this set method that pass the price to it
        this.price = price;
    }

    @Override

    public double getPrice() {//this get method that return the price mult. in 0.3
        return (price * 0.3);

    }

}
