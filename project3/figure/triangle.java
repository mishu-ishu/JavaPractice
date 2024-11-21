/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3.figure;

/**
 *
 * @author Maira
 */
public class triangle extends figure {
    triangle(double x, double y) {
        super(x, y);
    }
    
    double area() {
        System.out.print("Area of triangle: ");
        return (dim1*dim2)/2;
    }
}
