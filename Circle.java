
package com.mycompany.classabstract;




public class Circle extends Figure {
    protected double radio;
    
   
    
    public Circle(){
        System.out.println("Please insert a radio measurement of this circle");
        radio =  keyboardDouble.nextDouble();
    }
    
    public Circle(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
   
    
    @Override
    public double toCalculateArea() {
        double pi = 3.14;
        double result = radio * pi;
        return result;
    }
    
}
