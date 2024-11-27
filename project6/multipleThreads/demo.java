/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6.multipleThreads;

/**
 *
 * @author Maira
 */
public class demo {
    public static void main(String[] args) {
        new newThread("One");
        new newThread("Two");
        new newThread("Three");
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exited");
    }
}
