/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3.box;

/**
 *
 * @author Maira
 */
public class box {
    private double width;
    private double length;
    private double height;
    
    box(box ob) {
        width = ob.width;
        length = ob.length;
        height = ob.height;
    }
    
    box (double w, double l, double h) {
        width = w;
        height = h;
        length = l;
    }
    
    double vol() {
        return width * length * height;
    }
}
