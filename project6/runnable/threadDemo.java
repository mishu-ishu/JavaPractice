/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6.runnable;

/**
 *
 * @author Maira
 */
public class threadDemo {
    public static void main(String[] args) {
        new newThread();
        
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting Main thread");
    }
}
