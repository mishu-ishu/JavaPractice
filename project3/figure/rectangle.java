/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3.figure;

/**
 *
 * @author Maira
 */
public class rectangle extends figure {
    rectangle (double x, double y) {
        super(x, y);
    }
    
    double area() {
        System.out.print("Area of rectangle: ");
        return dim1*dim2;
    }
}
