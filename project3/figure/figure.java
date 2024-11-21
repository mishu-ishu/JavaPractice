/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3.figure;

/**
 *
 * @author Maira
 */
abstract class figure {
    double dim1;
    double dim2;
    
    figure(double x, double y) {
        dim1 = x;
        dim2 = y;
    }
    
    abstract double area();
}
