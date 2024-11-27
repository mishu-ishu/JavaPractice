/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6.multipleThreads;

/**
 *
 * @author Maira
 */
public class joinDemo {
    public static void main(String[] args) {
        newThread ob1 = new newThread("One");
        newThread ob2 = new newThread("Two");
        newThread ob3 = new newThread("Three");
        
        System.out.println("Thread 1 is alive: " + ob1.t.isAlive());
        System.out.println("Thread 2 is alive: " + ob2.t.isAlive());
        System.out.println("Thread 3 is alive: " + ob3.t.isAlive());
        
        try {
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Thread 1 is alive: " + ob1.t.isAlive());
        System.out.println("Thread 2 is alive: " + ob2.t.isAlive());
        System.out.println("Thread 3 is alive: " + ob3.t.isAlive());
        
        System.out.println("Main thread exited");
    }
}
