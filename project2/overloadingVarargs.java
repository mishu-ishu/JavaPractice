/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author Maira
 */
public class overloadingVarargs {
    static void vaTest(int ... v) {
        System.out.print(v.length + ":");
        
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + ":");
        
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Testing: ", 10, 20);
    }

}
