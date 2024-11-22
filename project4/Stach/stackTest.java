/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project4.Stach;

/**
 *
 * @author Maira
 */
public class stackTest {
    public static void main(String[] args) {
        stack stk;
        staticStack st = new staticStack(5);
        dynamicStack dy = new dynamicStack(8);
        
        System.out.println("Static stack:");
        stk = st;
        for (int i = 0; i < 5; i++) stk.push(i);
        for (int i = 0; i < 5; i++)
            System.out.println(stk.pop());
        
        System.out.println("Dynamic stack:");
        stk = dy;
        for (int i = 0; i < 8; i++) stk.push(i);
        for (int i = 0; i < 8; i++)
            System.out.println(stk.pop());          
    }
}
