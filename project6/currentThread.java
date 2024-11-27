/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6;

/**
 *
 * @author Maira
 */
public class currentThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        
        t.setName("MyThread");
        System.out.println(t);
        
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
