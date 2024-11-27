/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6.multipleThreads;

/**
 *
 * @author Maira
 */
public class newThread implements Runnable{
    String name;
    Thread t;
    
    newThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }
    
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " extiting");
    }
}
