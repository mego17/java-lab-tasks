package com.mycompany.myonlineshop;

public class MyOnlineShop {

    public static void main(String[] args) {
        // create an object as array which size of it 2 indexs from product abstract class .
        product[] array = new product[2];

//first index that create object from book class that inherits from product abstract claa
        array[0] = new book(30);//pass to constractor that value =30
         //call the method getprice for book and print its content
        System.out.println("the price of book is :"+ array[0].getPrice());

//second index that create object from children book class that inherits from product abstract claa
        array[1] = new ChildrenBook(10);//pass to constractor that value =10
        //call the method getprice for children and print its content
        System.out.println("the price of childrenbook is :"+array[1].getPrice());

    }
}
