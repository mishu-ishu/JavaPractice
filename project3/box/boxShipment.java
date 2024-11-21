/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3.box;

/**
 *
 * @author Maira
 */
public class boxShipment extends boxWeight {
    public double cost;
    
    boxShipment(boxShipment ob) {
        super(ob);
        cost = ob.cost;
    }
    
    boxShipment (double w, double h, double l, double wh, double c) {
        super (w, h, l, wh);
        cost = c;
    }
}
