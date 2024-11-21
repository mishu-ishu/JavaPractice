/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3.box;

/**
 *
 * @author Maira
 */
public class boxWeight extends box {
    public double weight;
    
    boxWeight(boxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    
    boxWeight(double w, double h, double l, double wh) {
        super(w, h, l);
        weight = wh;
    }
}
