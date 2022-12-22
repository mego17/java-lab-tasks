package com.mycompany.myonlineshop2;

public class MyOnlineShop2 {

    public static void main(String[] args) {
// create an object as array which size of it 3 indexs from product interface class .
        product[] array = new product[3];
        
//first index that create object from book class that inherits from product interface claa
        array[0] = new book(30); //pass to constractor that value =30
        //call the method getprice and print its content
        System.out.println("the price of book is :" + array[0].getPrice());
        
//second index that create object from children book class that inherits from product interface claa
        array[1] = new ChildrenBook(10);//pass to constractor that value =10
        //call the method getprice and print its content
        System.out.println("the price of childrenbook is :" + array[1].getPrice());
        
//third index that create object from cartoon book class that inherits from product interface claa
        array[2] = new CartoonBook(40);//pass to constractor that value =40
        //call the method getprice and print its content
        System.out.println("the price of cartoonbook is :" + array[2].getPrice());

    }
}
