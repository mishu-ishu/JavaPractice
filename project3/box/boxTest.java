/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3.box;

/**
 *
 * @author Maira
 */
public class boxTest {
    public static void main(String[] args) {
        boxShipment shipment1 = new boxShipment(10, 20, 30, 15, 2.333);
        boxShipment shipment2 = new boxShipment(shipment1);
        
        double vol = shipment1.vol();
        System.out.println(vol);
        System.out.println(shipment1.weight);
        System.out.println(shipment1.cost);
        
        vol = shipment2.vol();
        System.out.println(vol);
        System.out.println(shipment2.weight);
        System.out.println(shipment2.cost);
    }
}
