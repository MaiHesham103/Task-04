
package com.mycompany.task04;

public class Geometry {
    
    public double circleArea(double redius){
        if(redius < 0)
           throw new MyException("The input must positive");  
        else
            return(Math.PI * Math.pow(redius, 2));
    } 
    
    public double rectangleArea(double lenght, double width){
        if(lenght < 0 || width < 0)
            throw new MyException("The inputs must positive");
        else
            return(lenght * width);
    }
    
    public double triangleArea(double height, double base){
        if(height < 0 || base < 0)
            throw new MyException("The inputs must positive");
        else
            return(0.5 * base * height);    
    }
}
