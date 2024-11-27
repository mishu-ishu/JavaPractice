/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6.threadClass;

/**
 *
 * @author Maira
 */
public class newThread extends Thread{
    newThread() {
        super("Demo thread");
        System.out.println("Child thread: " + this);
        start();
    }
    
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
