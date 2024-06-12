
package com.mycompany.classabstract;


public class Square extends Figure{
    protected double side;
    
    public Square(){
        System.out.println("Please insert the meausurement of one side of this square");
        side = keyboardDouble.nextDouble();
    }
    
    @Override
    
    public double toCalculateArea() {
        double result = side * side;
        return result;
    }
    
}
