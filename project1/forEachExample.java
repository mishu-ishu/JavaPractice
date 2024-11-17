/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author Maira
 */
public class forEachExample {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int x : nums){
            x = x * 10;
            System.out.print(" " + x);
        }
        
        System.out.println("");
        
        for (int x : nums) {
            System.out.print(" " + x);
        }
        
        System.out.println("");
    }
}
