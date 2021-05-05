package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall(){

    }

    public Wall(double width, double height){
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(double width) {
        if(width <= 0){
            width = 0;
        }this.width = width;
    }

    public void setHeight(double height) {
        if(height <= 0){
            height = 0;
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return this.getHeight() * this.getWidth();
    }
}
