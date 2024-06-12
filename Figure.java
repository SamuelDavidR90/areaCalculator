
package com.mycompany.classabstract;

import java.util.Scanner;


public abstract class Figure {
    protected double x; //position x
    protected double y; //position y
    
    Scanner keyboardDouble = new Scanner(System.in);
    
    //constructors
    
    protected Figure(){
        
    }
    
    protected Figure(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    //methods->only they can have the access key as public
    
    public abstract double toCalculateArea();
}
