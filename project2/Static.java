/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author Maira
 */
public class Static {
    static int a = 10;
    static int b;
    
    static void meth(int x) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
    }
    
    static {
        System.out.println("Initialize");
        b = a + 2;
    }
    
    public static void main(String[] args) {
        meth(44);
    }
}
