/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6.multipleThreads.sychronizedMethod;

/**
 *
 * @author Maira
 */
public class synch {
    public static void main(String[] args) {
        callMe target = new callMe();
        caller call1 = new caller(target, "Hello");
        caller call2 = new caller(target, "Synchronized");
        caller call3 = new caller(target, "World");
        
        try {
            call1.t.join();
            call2.t.join();
            call3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
