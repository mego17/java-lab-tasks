package com.mycompany.task3;
// this class inherits (extends) from super circle class
public class cylinder extends circle {

    private double height; //variable defintion

    public cylinder() {//empty constractor

    }

    public cylinder(double height) { // i variable constractor
        this.height = height;

    }
// 2 variables constractor that one from this class and one from circle super class
    public cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
// 3 variables constractor that one from this class and two from circle super class

    public cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;

    }

    public void setHeight(double height) { //this pass to it the height
        this.height = height;
    }

    public double getHeight() {//this return the height
        return height;
    }

    public double getvolume() { // this get volume of cylider
        return (Math.PI * super.getRadius() * super.getRadius() * getHeight());// 3.14*r*r*h
    }

    @Override
//this method to return format that have height, radius and color of each cylinder
    public String tostring() {
        String m = String.format("[h=%f,r=%f,color=%s]", getHeight(), super.getRadius(), super.getColor());
        return m;

    }

}
