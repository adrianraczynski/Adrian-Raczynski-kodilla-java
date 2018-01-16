package com.kodilla.testing.shape;

interface Shape {

    String getShapeName();

    double getField();
}

class Rectangle implements Shape {

    public String getShapeName () {
        return "Shape: rectangle.";
    }

    public double getField (){
        return 23.5;
    }
}

class Circle implements Shape {

    public String getShapeName () {
        return "Shape: circle.";
    }

    public double getField (){
        return 12.9;
    }
}

class Triangle implements Shape {

    public String getShapeName () {
        return "Shape: triangle.";
    }

    public double getField (){
        return 72.4;
    }
}