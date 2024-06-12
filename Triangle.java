
package com.mycompany.classabstract;


public class Triangle extends Figure{
    protected double base;
    protected double height;
    
    public Triangle(){
        System.out.println("Please insert the base measurement of this Triangle");
        base = keyboardDouble.nextDouble();
        System.out.println("Insert the height ");
        height = keyboardDouble.nextDouble();
    }
    @Override
    public double toCalculateArea() {
       double result = base * height / 2;
       return result;
       
    }
    
}
