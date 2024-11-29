/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project7;

/**
 *
 * @author Maira
 */
public class producer implements Runnable{
    q q;
    
    producer(q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}
