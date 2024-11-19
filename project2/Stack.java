/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author Maira
 */
public class Stack {
    int stck[] = new int[10];
    int tos;
    
    Stack() {
        tos = -1;
    }
    
    void push (int item) {
        if (tos == 9) 
            System.out.println("Overflow");
        else
            stck[++tos] = item;
    }
    
    int pop() {
        if (tos < 0){
            System.out.println("Underflow");
            return 0;
        }
        else 
            return stck[tos--];
    }
}
