package com.mycompany.task3;
// this is super class 
public class circle {

    private double radius;//variable defintion use in method
    private String color;//variable defintion use in method

    public circle(){  //this is  empty constractor
    }

    public circle(double radius) {//this is  1 variable constractor
        this.radius = radius;
    }

    public circle(double radius, String color) {//this is  2 variables constractor
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) { //this set method to pass the radius
        this.radius = radius;
    }

    public double getRadius() {//this get method to return the radius
        return radius;
    }

    public void setColor(String color) {//this set method to pass the color
        this.color = color;
    }

    public String getColor() {//this get method to return the color
        return color;
    }

    public double getarea() { //this method to calculate the area of circle
        return (Math.PI * getRadius() * getRadius()); // 3.14*r*r
    }
   //this method to return format that have radius and color of each circle
    public String tostring() { 
        String m = String.format("[r=%f,color=%s]", getRadius(), getColor());
        return m;

    }

}
