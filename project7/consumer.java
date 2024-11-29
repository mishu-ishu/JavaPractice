/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project7;

/**
 *
 * @author Maira
 */
public class consumer implements Runnable{
    q q;
    
    consumer(q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    
    public void run() {
        int i = 0;
        while(true) {
            q.get();
        }
    }
}
