/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author Maira
 */
public class passAr {
    static void vaTest(int ... v) {
        System.out.print(v.length + ":");
        
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
