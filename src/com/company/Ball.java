package com.company;

public class Ball {
    private String sport;
    private int diameter;
    public Ball(String sp, int d){
        this.sport=sp;
        this.diameter=d;
    }
    public void setSport(String sport){
        this.sport=sport;
    }
    public void setDiameter(int diameter){
        this.diameter=diameter;
    }
    public String getSport(){
        return sport;
    }
    public int getDiameter(){
        return diameter;
    }
    public String toString (){
        return sport+" ball has a diameter of "+diameter+"mm";
    }
}
