/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6.multipleThreads.sychronizedMethod;

/**
 *
 * @author Maira
 */
public class caller implements Runnable{
    String msg;
    callMe target;
    Thread t;
    
    caller (callMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
