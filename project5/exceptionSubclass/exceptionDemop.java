/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project5.exceptionSubclass;

/**
 *
 * @author Maira
 */
public class exceptionDemop {
    static void compute(int a) throws myException {
        System.out.println("Called compute(" + a +")");
        if (a > 10) 
            throw new myException(a);
        System.out.println("Normal exit");
    }
    
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (myException e) {
            System.out.println("Caught " + e);
        }
    }
}
