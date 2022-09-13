package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point b) {
        return Math.sqrt(Math.pow(b.getX()-getX(),2) + Math.pow(b.getY()-getY(), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double i) {
        x+=i;
    }

    public void shiftY(double i) {
        y+=i;
    }

    public void rotate(double rotation) {
        x = (x*(Math.cos(rotation))) - (y*(Math.sin(rotation)));
        y = (x*(Math.sin(rotation))) + (y*(Math.cos(rotation)));
    }

    //created an equals method for a cleaner way to unit test the rotate method
    public boolean equals(Point a){
        return (x == a.getX() && y == a.getY());
    }

    public String toString() {
        return "Point{x = " + x + ", y = " + y + "}";
    }
}
