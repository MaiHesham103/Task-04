
package com.mycompany.task04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task04 {

    public static void main(String[] args){
        //creat object Scanner
        Scanner input = new Scanner(System.in);
        
        //creat object PrintWriter to write in file
       PrintWriter pw = null, pout = null;
        try {
            pw = new PrintWriter("data.txt");
            pout = new PrintWriter("out.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        //creat scanner PrintWriter to read from file
        File file = new File("data.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        //creat object Geomtry
       Geometry g = new Geometry();
       
        //The programme
        System.out.print("1. Calculate the Area of a Circle \n"
                + "2. Calculate the Area of a Rectangle \n"
                + "3. Calculate the Area of a Triangle \n"
                + "4. Quit \n"
                + " Enter your choice (1-4): ");
        
        //read the choice and write it in the file
        int choice = input.nextInt();
        pw.println(choice);
        pw.flush();
        
        // read the choice from the file
        int ch = scan.nextInt();
        
        //responds to the user’s selection
        if(ch > 4 || ch < 1)
            throw new MyException("Invalid input");
        else{
            if(ch == 1){
            System.out.println("Enter the redius");
            double redius = input.nextDouble();
            pout.println("the area of the cicle is " + g.circleArea(redius));
            }
            
            else if(ch == 2){
            System.out.println("Enter the lenght and width");
            double lenght = input.nextDouble();
            double width = input.nextDouble();
            pout.println("The area of the rectangle is " + g.rectangleArea(lenght, width)); 
            }
            
            else if(ch == 3){
            System.out.println("Enter the height and base");
            double height = input.nextDouble();
            double base = input.nextDouble();
            pout.println("The area of the triangle is " + g.triangleArea(height, base)); 
           }
            
           else if(ch == 4){
             pout.println("Thank you");
            }    
        }
       
        pw.close();
        pout.close();
    
    }
}
