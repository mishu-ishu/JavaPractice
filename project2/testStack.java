/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;


/**
 *
 * @author Maira
 */
public class testStack {
    public static void main(String[] args) {
        Stack stk = new Stack();
        
        for (int i = 0; i < 10; i++) {
            stk.push(i);
        }
        
        System.out.println("Stack:");
        for (int i = 0; i < 10; i++) {
            
            System.out.println(stk.pop());
        }
    }
}
