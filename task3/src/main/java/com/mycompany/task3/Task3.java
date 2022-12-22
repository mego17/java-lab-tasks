package com.mycompany.task3;

public class Task3 {

    public static void main(String[] args) {
//create object from super class circle and give its constractor 2 variables r=2 and color is red
        circle c = new circle(2, "red");

//create object from class cylinder that extends from supervclass  and give its
//constractor 2 variables  h=5, r=2 and color is red
        cylinder c1 = new cylinder(5, 2, "red");
        //call methods tostring and get area and print its contants
        System.out.println(c.tostring());
        System.out.println(c.getarea());

        //call methods tostring and get volume and print its contants
        System.out.println(c1.tostring());
        System.out.println(c1.getvolume());

    }
}
