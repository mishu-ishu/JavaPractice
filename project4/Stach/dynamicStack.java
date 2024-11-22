/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project4.Stach;

/**
 *
 * @author Maira
 */
public class dynamicStack implements stack{
    private int stck[];
    private int tos;
    
    dynamicStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    
    public void push(int item) {
        if (tos == stck.length-1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }
    
    public int pop() {
        if (tos < 0) {
            System.out.println("Underflow");
            return 0;
        }
        else 
            return stck[tos--];
    }
}
