package com.mycompany.myonlineshop;
//this inerit class that inherits (extends) from product class that use  set and get methods 

public class ChildrenBook extends product {

   // double w;

    public ChildrenBook(double price) {// this is constractor to define class
        this.price = price;
    }

    @Override
    public double getPrice() {//this get method that return the price mult. in 0.3
        //w=(price*0.3);
        return (price * 0.3);
        //return w;
    }

   /*
void display() {
        System.out.println("the price of childrenbook is : " + w);

    }
*/
}
