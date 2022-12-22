package com.mycompany.myonlineshop;
//this inerit class that inherits (extends) from product class that use  set and get methods 

public class book extends product {

    //double z;

    public book(double price) { // this is constractor to define class
        this.price = price;
    }

    @Override
    public double getPrice() {//this get method that return the price mult. in 0.5
        return (price * 0.5);
        //z = (price * 0.5);
        //return z;

    }

   /* 
    void display() {
        System.out.println("the price of book is : " + z);

    }
    */

}
